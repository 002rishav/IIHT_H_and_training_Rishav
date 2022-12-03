package com.basic.lambdasort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CourseSort {

static List<Courses> courseList = CourseData.getAllCourses();
	
	public static List<Courses> printDetailsUsingFeesAscending(){
        System.out.println("printDetails Using FeesAscendingOrcer : ");
        courseList.sort(Comparator.comparing(c -> c.getTotal_fees()));
		return courseList;
    }
	
	public static List<Courses> printDetailsUsingFeesDescending(){
        System.out.println("\nprintDetails Using FeesDescendingOrder : ");
        courseList.sort(Comparator.comparing(c -> c.getTotal_fees()));
        Collections.reverse(courseList);
        return courseList;
    }
	
	public static List<Courses> printDetailsUsingDurationCondition(){
        System.out.println("\nprintDetails Using DurationCondition : ");
        courseList.sort(Comparator.comparing(c -> c.getCourse_duration()));
        return courseList;
    }

	public static void main(String[] args) {
		printDetailsUsingFeesAscending();
		System.out.println(courseList);
		
		printDetailsUsingFeesDescending();
		System.out.println(courseList);
		
		printDetailsUsingDurationCondition();
		System.out.println(courseList);

	}

}
