package com.basic.lambdasort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CourseSort {

	public static void printDetailsUsingFeesCondition(){
        System.out.println("printDetails Using FeesCondition : ");
        List<Courses> courseList = CourseData.getAllCourses();
        List<Courses> ab=courseList.stream()
        	.sorted(Comparator.comparing(p -> p.getTotal_fees()))
        	.collect(Collectors.toList());
        System.out.println(ab);
    }
	
	public static void printDetailsUsingDurationCondition(){
        System.out.println("\nprintDetails Using DurationCondition : ");
        List<Courses> courseList = CourseData.getAllCourses();
        List<Courses> ab=courseList.stream()
        	.sorted(Comparator.comparing(p -> p.getCourse_duration()))
        	.collect(Collectors.toList());
        System.out.println(ab);
    }
	
	public static void main(String[] args) {
		
		printDetailsUsingFeesCondition();
		printDetailsUsingDurationCondition();

	}

}
