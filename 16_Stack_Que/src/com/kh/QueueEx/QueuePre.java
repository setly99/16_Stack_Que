package com.kh.QueueEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePre {
	
	//main
	public static void main(String[] args) {
		
		//offer 80 60 30 20
		Queue<Integer> q1 = new LinkedList<>();
		q1.offer(80);
		q1.offer(60);
		q1.offer(30);
		q1.offer(20);
		
		//poll 데이터 확인 및 제거
		System.out.println("poll : " + q1.poll());
		
		//peek 맨 앞 데이터 확인
		System.out.println("peek : " + q1.peek());
		
		//isEmpty 비어있는지 확인
		System.out.println("isEmpty : " + q1.isEmpty());
		
		
		

	}

}
