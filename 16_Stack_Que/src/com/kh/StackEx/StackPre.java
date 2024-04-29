package com.kh.StackEx;

import java.util.Stack;

public class StackPre {
	//main 메인메서드에서 작성
	public static void main(String[] args) {
		//Stack 활용해서 10 30 50 40 20 push사용해서 넣고
		Stack<Integer> stck = new Stack<>();
		stck.push(10);
		stck.push(30);
		stck.push(50);
		stck.push(40);
		stck.push(20);
		
		//pop맨 위 값 지우고 반환해서 확인
		System.out.println("pop : " + stck.pop());
		
		//peek현재 맨 위 값 확인
		System.out.println("peek : " + stck.peek());
		
		//isEmpty비어있는지 확인
		System.out.println("isEmpty : " + stck.isEmpty());
		
		//size크기는 몇인지 확인
		System.out.println("size : " + stck.size());
	}
	

}
