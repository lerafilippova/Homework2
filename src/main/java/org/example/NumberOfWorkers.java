package org.example;

public class NumberOfWorkers {
    final int numberProgrammers = 5;
    final int numberTesters = 2;
    final int supportSpecialists = 1;
    final int allNumberTesters = numberProgrammers * numberTesters;
    final int allSupportSpecialists = numberProgrammers * supportSpecialists;
    final int allWorkers = numberProgrammers + allNumberTesters + allSupportSpecialists;
}