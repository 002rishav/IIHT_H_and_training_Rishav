package com.basics.functionalInterface;

import java.util.function.Predicate;

public class PredicateDemo /*implements Predicate<Integer>*/ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Predicate<Integer> predicate=new PredicateDemo();
		Predicate<Integer> predicate=(t)->(t%2==0);
		System.out.println(predicate.test(6));
	}

//	@Override
//	public boolean test(Integer t) {
//		// TODO Auto-generated method stub
//		if(t%2==0) {
//			return true;
//		}
//		return false;
//	}

}
