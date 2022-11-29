package com.basic.reference;

public class RefDemo {
	
	public static void main(String[] args) {
		System.out.println("Method reference demo");
	
	
	//provide implementation of IWork
	IWork iWork = ()->{
		System.out.println("This is doProject from IWork");
		};
	iWork.doProject();
	
	IWork iWork1 = Project::projectProgress;
	iWork1.doProject();
	
	
	}

}
