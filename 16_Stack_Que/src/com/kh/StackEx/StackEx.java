//16_Stack_Que 240429_1423 생성
package com.kh.StackEx;

import java.util.Stack;

/*
Stack(스택)
	데이터를 저장하는 자료구조
	LIFO Last In - First Out : 마지막에 추가된 항목이 먼저 제거
	뒤로가기 기능, 실행취소 기능
	
	pop() : 맨 위 값을 제거하고 반환(보여줌)
	peek() : 스택이나 큐에서 맨 위 또는 맨 앞에 있는 데이터를 반환(보여줌) 하지만 제거하지는 않음
	push() : 스택에서 값을 추가할 때는 push사용하거나 add사용해서 넣음
		주로 스택에서는 push를 사용
		add는 리스트나 컬렉션에서 주로 사용
		Stack클래스가 Vector를 상속받아 만들어진 클래스기 때문에 add가능
	isEmpty() : 값이 비어있는지 확인
	size() : 크기 확인
	
	
	
*/
public class StackEx {
	
	public static void main(String[] args) {
		Stack<Integer> stck = new Stack<>();
		
		stck.add(1);
		stck.add(2);
		stck.add(3);
		
		//스택에서 맨 위 데이터를 확인하고 지우기
		//pop() : 맨 위에 있는 데이터를 제거하고 그 값을 반환(보여줌)
		int tp = stck.pop();
		System.out.println(tp);
		
		//peek() : 스택에서 맨 위 데이터 확인
		int numCk = stck.peek();
		System.out.println(numCk);
		
		//isEmpty() : 스택이 비어있는지 확인
		boolean isEmpty = stck.isEmpty();
		System.out.println(isEmpty);
		
		System.out.println("======= 스택 2 =======");
		
		Stack<Integer> stck2 = new Stack<>();
		stck2.push(1);
		stck2.push(2);
		stck2.push(3);
		stck2.push(4);
		int miss = stck2.pop();
		System.out.println("가장 마지막에 보여주고 사라진 스택2의 값 : " + miss);
		
		int tp2 = stck2.peek();
		System.out.println("스택 2의 맨 위 값은 : " + tp2);
		
		boolean isEmpty2 = stck2.isEmpty();
		System.out.println("스택2가 비어있나요? " + isEmpty2);
		
		int siz2 = stck2.size();
		System.out.println("스택2의 사이즈는 ? " + siz2);
		
		
		
		
	}
	

}
