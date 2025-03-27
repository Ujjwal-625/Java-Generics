package com.bridgelabz.coursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class CourseManagement {
    public static void main(String[] args) {
        // Creating courses
        Course<ExamCourse> mathCourse = new Course<>(new ExamCourse("Mathematics", "Dr. Smith", 70));
        Course<AssignmentCourse> csCourse = new Course<>(new AssignmentCourse("Computer Science", "Prof. Johnson", 5));
        Course<ResearchCourse> aiCourse = new Course<>(new ResearchCourse("AI & ML", "Dr. Brown", "Deep Learning"));

        // Storing courses in a list
        List<CourseType> courseCatalog = new ArrayList<>();
        courseCatalog.add(mathCourse.getCourseDetails());
        courseCatalog.add(csCourse.getCourseDetails());
        courseCatalog.add(aiCourse.getCourseDetails());

        // Display all courses
        System.out.println("University Course Catalog:");
        CourseUtils.displayAllCourses(courseCatalog);
    }
}

