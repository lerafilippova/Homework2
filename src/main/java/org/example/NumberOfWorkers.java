package org.example;

public class NumberOfWorkers {
    private final int numberProgrammers = 5;
    private final int numberTesters = 2;
    private final int supportSpecialists = 1;
    private final int allNumberTesters = numberProgrammers * numberTesters;
    private final int allSupportSpecialists = numberProgrammers * supportSpecialists;
    private final int allWorkers = numberProgrammers + allNumberTesters + allSupportSpecialists;
}