package com.javaapplication.javaappmodel;

import org.junit.jupiter.api.Test;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class BasicTests {
    @Test
    public void BasicTestOne() {
        Race race = new Race();
        race.setTitle("Race Title");
        race.setStartDate(new Date(123, 9, 10));

        Runner runner1 = new Runner();
        runner1.setName("Runner One");
        runner1.setRunnerStatus(RunnerStatus.RUNNER);
        Runner runner2 = new Runner();
        runner2.setName("Runner Two");
        ArrayList<Runner> runners = new ArrayList<Runner>(1);
        runners.add(runner1);
        runners.add(runner2);

        race.setRunners(runners);
    }
}
