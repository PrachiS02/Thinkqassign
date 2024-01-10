package com.queuestack;

import java.util.LinkedList;
import java.util.Queue;

public class TopElement {

	public static void main(String[] args) {
		Queue<String> colorQueue = new LinkedList<>();

		colorQueue.offer("Red");
		colorQueue.offer("Green");
		colorQueue.offer("White");
		colorQueue.offer("Black");
		colorQueue.offer("Purple");

		System.out.println(colorQueue);
		
		String topElement = colorQueue.peek();
		
		System.out.println(topElement);

	}


	}


