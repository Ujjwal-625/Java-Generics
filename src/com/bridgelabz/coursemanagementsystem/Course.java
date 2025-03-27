package com.bridgelabz.coursemanagementsystem;

import java.util.List;

public class Course<T extends CourseType> {
    private T courseDetails;

    public Course(T courseDetails) {
        this.courseDetails = courseDetails;
    }

    public T getCourseDetails() {
        return courseDetails;
    }

    public void display() {
        courseDetails.displayCourseDetails();
    }
}


class CourseUtils {
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.displayCourseDetails();
        }
    }
}

