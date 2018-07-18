package com.prometheus.task3.task5;

public class CommandEcho implements Command {

    String text;

    CommandEcho(String text) {
        this.text = text;
    }

    public void execute() {
        System.out.println(text);
    }
}
