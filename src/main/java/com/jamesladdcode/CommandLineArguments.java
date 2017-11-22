package com.jamesladdcode;

import java.util.Arrays;
import java.util.List;

public class CommandLineArguments {

    private final List<String> arguments;

    public CommandLineArguments(String[] arguments) {
        this.arguments = Arrays.asList(arguments);
    }

    public String toString() {
        return arguments.toString();
    }
}
