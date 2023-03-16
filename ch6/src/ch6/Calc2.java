package ch6;

import java.util.Iterator;

public class Calc2 {
	int add(int a, int b){
		return a+b;
	}
	
	long add(int num1, long num2) {
		return num1 + num2;
	}
	
	long add(long num1, int num2) {
		return num1 + num2;
	}
	
	float add(int a, float b) {
		return a+b;
	}
	
	int add(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result +=arr[i];
		}
		return result;
	}
	
	
  


}

