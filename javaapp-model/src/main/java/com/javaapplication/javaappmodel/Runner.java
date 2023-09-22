package com.javaapplication.javaappmodel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Runner {
    private String Name;
    private RunnerStatus RunnerStatus = com.javaapplication.javaappmodel.RunnerStatus.UNKNOWN;
}
