package ch5;

import java.util.Arrays;

public class ArrayEx5 {

	public static void main(String[] args) {
		int[]numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for (int i = 0; i < 100; i++) {
			//0~9 사이의 임의의 값 구하기
			int n = (int)(Math.random()*10);
			
			//구한 자리와 0 요소랑 값을 교환하기
			int temp = numArr[0]; //numArr[0] 의 값을 temp 변수에 담기(무조건 오른쪽값을 왼쪽에 담음)
			numArr[0] = numArr[n];
			numArr[n] = temp;
		}
		System.out.println(Arrays.toString(numArr));

	}

}
