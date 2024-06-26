package com.kh.QueueEx;

import java.util.LinkedList;
import java.util.Queue;

/*
Queue(큐)
	먼저 추가된 항목이 먼저 제거
	First In - First Out : 먼저 추가된 항목이 가장 먼저 제거
	데이터가 줄을 서 있는 것과 유사하며, 가장 먼저 들어간 항목이 가장 앞에 위치
	대기, 이벤트 처리
	
메서드
	offer() : 큐에 공간이 충분한 경우 값이 추가되고, 추가되면 true 반환
		추가되지 못하면 예외
		add를 사용할 수 있지만 offer와 마찬가지로 공간이 없으면 예외처리됨
	poll() : 값을 제거하고 반환 만약에 비어있는 경우 null 반환
	remove() : poll 과 동일한 기능을 수행하지만, 비어있는 경우 예외 던짐
	peek() : 맨 앞에 있는 값을 반환하지만 제거하지는 않음
	element() : peek처럼 맨 앞에 있는 값을 반환하지만 제거하지 않음. 비어있는 경우 예외를 던짐
	

*/
public class QueueEx {
	
	public static void main(String[] args) {
		//Queue는 인터페이스이기 때문에 직접 Queue를 사용할 수 없음
		//Queue					LinkedList 사용해서 많이 작성
		Queue<Integer> q1 = new LinkedList<>();
		
		//큐에 데이터 추가
		q1.offer(1);
		q1.offer(2);
		q1.offer(3);
		
		//큐에서 맨 앞 데이터를 확인 제거
		int fw = q1.poll();//제일먼저들어간 1 확인 후 제거
		System.out.println("poll : " + fw);
		
		//큐 맨 앞 데이터 확인
		int dtChk = q1.peek();//1 제거 후 가장 앞인 2확인
		System.out.println("peek : " + dtChk);
		
		boolean isEmpty = q1.isEmpty();
		System.out.println("비어있나요? " + isEmpty);
		
		
		
	}
}
