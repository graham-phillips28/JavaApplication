package com.javaapplication.javaappmodel;


import lombok.Setter;
import lombok.Getter;
import java.util.ArrayList;
import java.util.Date;
@Getter
@Setter
public class Race {
    private String Title;
    private Date StartDate;
    private ArrayList<Runner> Runners;
    public Race() {}
}
