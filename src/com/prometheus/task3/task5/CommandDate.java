package com.prometheus.task3.task5;

public class CommandDate implements Command{

    @Override
    public void execute() {
        System.out.println(System.currentTimeMillis());
    }
}
