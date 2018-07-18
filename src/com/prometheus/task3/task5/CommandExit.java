package com.prometheus.task3.task5;

public class CommandExit implements Command {
    @Override
    public void execute() {
        System.out.println("Goodbye!");
    }
}
