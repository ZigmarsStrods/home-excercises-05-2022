package io.codelex.oop.exercise04;

public enum Runner {

    BEGINNER(211, 600),
    INTERMEDIATE(151, 210),
    ADVANCED(0, 150);

    private final double minTime;
    private final double maxTime;

    private Runner(double minTime, double maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(double runningTime) {
        for (Runner run : Runner.values()) {
            if (runningTime >= run.minTime && runningTime <= run.maxTime) {
                return run;
            }
        }
        return null;
    }
}
