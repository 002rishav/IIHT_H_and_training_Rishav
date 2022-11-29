package com.basic.reference;

import java.time.LocalDate;

public class Project {
	
	public static void projectProgress() {
		System.out.println("Project is making progress");
		
		System.out.println("Project status was approved by client");
		
		LocalDate now=LocalDate.now();
		System.out.println("on "+now.toString());
		
	}

}
