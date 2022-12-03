package com.basic.lambdasort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CourseSort {

	static List<Courses> courseList = CourseData.getAllCourses();
	
	public static void printDetailsUsingFeesAscending(){
        System.out.println("printDetails Using FeesAscendingOrcer : ");
//        List<Courses> courseList = CourseData.getAllCourses();
        
        List<Courses> fees_ascending=courseList.stream()
        	.sorted(Comparator.comparing(c -> c.getTotal_fees()))
        	.collect(Collectors.toList());
        System.out.println(fees_ascending);
    }
	
	public static void printDetailsUsingFeesDescending(){
        System.out.println("\nprintDetails Using FeesDescendingOrder : ");

        List<Courses> fees_descending=courseList.stream()
        	.sorted(Comparator.comparing(c -> c.getTotal_fees()))
        	.collect(Collectors.toList());
        Collections.reverse(fees_descending);
        System.out.println(fees_descending);
    }
	
	public static void printDetailsUsingDurationCondition(){
        System.out.println("\nprintDetails Using DurationCondition : ");
        
        List<Courses> duration=courseList.stream()
        	.sorted(Comparator.comparing(c -> c.getCourse_duration()))
        	.collect(Collectors.toList());
        System.out.println(duration);
    }
	
	public static void main(String[] args) {
		
		printDetailsUsingFeesAscending();
		printDetailsUsingFeesDescending();
		printDetailsUsingDurationCondition();

	}

}
