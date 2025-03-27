package com.bridgelabz.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        // Creating resumes for different job roles
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Alice Johnson", 5, "Java"));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bob Smith", 3, "Python"));
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Charlie Brown", 7, "E-commerce"));

        // Storing resumes in a list
        List<JobRole> candidatePool = new ArrayList<>();
        candidatePool.add(seResume.getCandidateDetails());
        candidatePool.add(dsResume.getCandidateDetails());
        candidatePool.add(pmResume.getCandidateDetails());

        // Process all resumes
        ResumeScreeningUtils.screenCandidates(candidatePool);
    }
}
