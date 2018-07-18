package com.prometheus.task3.task5;


import java.util.Objects;

public class Application {
    public static void main(String[] args){
        //YOUR CODE COMES HERE
        /*Command command = new CommandEcho("Test Command Echo");
        command.execute();
        command = new CommandHelp();
        command.execute();
        command = new CommandDate();
        command.execute();
        command = new CommandExit();
        command.execute();*/
        Command command;

        if (args.length > 2 || args.length ==0 || args[0].equals("") || args[0] == null ) //Objects.equals(args[0], "")
            System.out.println("Error");
        else {
            if (args.length ==1 && !args[0].equals("")){
                switch (args[0]) {
                    case "help": {
                        command = new CommandHelp();
                        command.execute();
                        break;
                    }
                    case "exit": {
                        command = new CommandExit();
                        command.execute();
                        break;
                    }
                    default:
                        System.out.println("Error");
                }
            }
            if (args.length ==2 && !args[0].equals("") && !args[0].equals("")){
                switch (args[0]) {
                    case "echo": {
                        if (!args[1].equals("")) {
                            command = new CommandEcho(args[1]);
                            command.execute();
                        }
                        else System.out.println("Error");
                        break;
                    }
                    case "date": {
                        if (args[1].equals("now")) {
                            command = new CommandDate();
                            command.execute();
                        }
                        else System.out.println("Error");
                        break;
                    }

                    default:
                        System.out.println("Error");
                }
            }
        }
    }
}
