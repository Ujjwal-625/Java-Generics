package com.bridgelabz.resumescreeningsystem;

public class Resume<T extends JobRole> {
    private T candidateDetails;

    public Resume(T candidateDetails) {
        this.candidateDetails = candidateDetails;
    }

    public T getCandidateDetails() {
        return candidateDetails;
    }

    public void processResume() {
        candidateDetails.displayJobDetails();
    }
}
