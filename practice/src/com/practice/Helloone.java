package com.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Helloone {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		System.out.println("Dequeue: " + queue.poll());
		System.out.println("Dequeue: " + queue.poll());
	}
}
