package network;

import java.net.URL;

/*
 * URL(Uniform Resource Locator)
 * 
 * https://docs.oracle.com
 * https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%98%81%ED%99%94=영화
 * 
 * 프로토콜 : https (자원에 접근하기 위해 서버와 통신하는 데 필요한 통신규약)
 * 호스트명 : www.naver.com, search.naver.com(서버 이름)
 * 경로명 : 접근하려는 자원이 저장된 서버상의 위치
 * 파일명 : Scanner.html
 * 쿼리 : URL 에서 '?'이후 부분 where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%98%81%ED%99%94 = 영화  (쿼리가 없을수도 있음)
 */
public class UrlEx1 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%98%81%ED%99%94=영화");
			
			System.out.println("url.getAuthority() : "+url.getAuthority());
			System.out.println("url.getContent() : "+url.getContent());
			System.out.println("url.getDefaultPort() : "+url.getDefaultPort());
			System.out.println("url.getPort() : "+url.getPort());
			System.out.println("url.getFile() : "+url.getFile());
			System.out.println("url.getHost() : "+url.getHost());
			System.out.println("url.getPath() : "+url.getPath());
			System.out.println("url.getProtocol() : "+url.getProtocol());
			System.out.println("url.getQuery() : "+url.getQuery());
			System.out.println("url.getUserInfo() : "+url.getUserInfo()); //UserInfo : 사용자 정보
			//toExternalForm() : URL 문자열로 반환
			System.out.println("url.toExternalForm() : "+url.toExternalForm());
			//toURI() : URL ==>URI
			// URI 가 URL 을 포함하고 있는 개념
			System.out.println("url.toURI() : "+url.toURI());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
