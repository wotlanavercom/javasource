package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 스택 : 수식계산, 수식 괄호검사, 워드 undo / redo, 웹브라우저 뒤로, 앞으로
// 큐 : 최근사용문서, 인쇄작업 대기목록, 버퍼

public class ListEx4 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		Queue<String> queue = new LinkedList<>();
		
		//스택 삽입
		stack.push("0");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		
		//큐 삽입
		queue.offer("0");
		queue.offer("1");
		queue.offer("2");
		queue.offer("3");
		
		System.out.println("======== Stack ==========");
		while (!stack.isEmpty()) {
			System.out.println(stack.pop()); //3210(역순으로 출력)
		}
		
		System.out.println("======== Queue ==========");
		while (!queue.isEmpty()) {
			System.out.println(queue.poll()); //0123
		}

	}

}
