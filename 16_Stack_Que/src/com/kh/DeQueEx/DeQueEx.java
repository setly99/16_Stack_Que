package com.kh.DeQueEx;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Deque(덱)
	양쪽 끝에서 삽입과 삭제가 모두 가능
	스택 + 큐 의 기능을 모두 제공
	양방향으로 데이터를 추가하거나 제거할 수 있음

메서드
	addFirst() : 맨 앞에 값 추가
	addLast() : 맨 뒤에 값 추가
	removeFirst : 맨 앞 값 제거
	removeLast : 맨 뒤 값 제거
	getFirst : 맨 앞의 값이 무엇인지 확인(제거하지 않음)
	getLast : 맨 뒤 값이 무엇인지 확인(제거하지 않음)
	
	Deque - 인터페이스이기 때문에 ArrayDeque로 된 객체를 이용해서 공간 생성
	
*/
public class DeQueEx {
	
	public static void main(String[] args) {
		//Deque생성
		Deque<Integer> dq1 = new ArrayDeque<>();
		
		//맨 앞에 값 추가
		dq1.addFirst(1);
		dq1.addFirst(2);
		dq1.addFirst(3);
		System.out.println("addFirst활용해서 값 추가 : " + dq1);
		
		//맨 뒤에 값 추가: add - addLast(자동)
		dq1.addLast(4);
		dq1.addLast(5);
		dq1.addLast(6);
		System.out.println("addLast활용해서 값 추가 : " + dq1);
		
		//맨 앞의 값 제거
		dq1.removeFirst();
		System.out.println("removeFirst활용해서 값 제거 확인 : " + dq1);
		
		//맨 뒤의 값 제거
		dq1.removeLast();
		System.out.println("removeLast활용해서 값 제거 확인 : " + dq1);
		
		//맨 앞의 값 확인
		int fwd = dq1.getFirst();
		System.out.println("맨 앞에 위치한 값은 : " + fwd);
		
		//맨 뒤의 값 확인
		int back = dq1.getLast();
		System.out.println("맨 뒤에 위치한 값은 : " + back);
		
		
	}
}