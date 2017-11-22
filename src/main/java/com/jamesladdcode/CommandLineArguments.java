package com.jamesladdcode;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CommandLineArguments {

    private static final Logger LOG = Logger.getLogger(CommandLineArguments.class);

    private final List<String> arguments;

    CommandLineArguments(String[] arguments) {
        this.arguments = Arrays.asList(arguments);
    }

    public String toString() {
        return arguments.toString();
    }

    public void forEach(Consumer<String> consumer) {
        LOG.trace("Enter.");
        arguments.forEach(consumer);
        LOG.trace("Exit.");
    }
}
