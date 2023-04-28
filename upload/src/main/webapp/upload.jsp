<%@page import="java.util.Iterator"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	
	//현재 request에 file upload 요청이 들어 있는지 확인
	boolean isMultipart = ServletFileUpload.isMultipartContent(request);

	if(isMultipart){
		DiskFileItemFactory factory = new DiskFileItemFactory();		

		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);

		// Parse the request
		List<FileItem> items = upload.parseRequest(request);
		
		Iterator<FileItem> iter = items.iterator();
		
		String name = null, value = null;
		
		while (iter.hasNext()) {
		    FileItem item = iter.next();

		    //일반요소
		    if (item.isFormField()) {
		    	name = item.getFieldName();
		        value = item.getString("utf-8");
		        out.print("<h3>일반 데이터</h3>");
		        out.print(name+" : "+value+"<br>");
		    } else { //파일요소
		    	name = item.getFieldName();
		        value = item.getName();
		        long size = item.getSize();
		        
		        out.print("<h3>파일 데이터</h3>");
		        out.print(name+" : "+value+" - "+size+"<br>");
		        
		        //파일 저장
		        if(!name.isEmpty()){
		        	String path = "c:\\upload";
		        	
		        	File f = new File(path+"\\"+value); // c:\\upload\\test.html
		        	item.write(f); //파일저장 코드
		        }
		    }
		}
	}


%>