package com.jamesladdcode;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CommandLineArguments {

    private final List<String> arguments;

    CommandLineArguments(String[] arguments) {
        this.arguments = Arrays.asList(arguments);
    }

    public String toString() {
        return arguments.toString();
    }

    public void forEach(Consumer<String> consumer) {
        arguments.forEach(consumer);
    }
}
