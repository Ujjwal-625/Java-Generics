package com.bridgelabz.coursemanagementsystem;

public class ResearchCourse extends CourseType {
    private String researchTopic;

    public ResearchCourse(String courseName, String instructor, String researchTopic) {
        super(courseName, instructor);
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Research Course: " + getCourseName() + " | Instructor: " + getInstructor() +
                " | Research Topic: " + researchTopic);
    }
}

