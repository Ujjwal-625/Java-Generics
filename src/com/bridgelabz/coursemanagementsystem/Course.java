package com.bridgelabz.coursemanagementsystem;

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
