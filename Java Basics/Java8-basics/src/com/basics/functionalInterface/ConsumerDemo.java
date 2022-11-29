package com.basics.functionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {

//	@Override
//	public void accept(Integer t) {
//		// TODO Auto-generated method stub
//		System.out.println("printing: "+t);
//	}
	
	public static void main(String[] args) {
		
		Consumer<Integer> consumer=(t)-> System.out.println("printing: "+t);
		consumer.accept(4000);
	}
	
	

}
