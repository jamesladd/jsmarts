package com.jamesladdcode.business.domain;

import com.jamesladdcode.CommandLineArguments;
import com.jamesladdcode.business.BusinessInput;
import com.jamesladdcode.business.BusinessOperationInvoker;
import org.apache.log4j.Logger;

public class ThingsInput implements BusinessInput {

    private static final Logger LOG = Logger.getLogger(ThingsInput.class);

    private final CommandLineArguments arguments;

    ThingsInput(CommandLineArguments arguments) {
        this.arguments = arguments;
        if (LOG.isDebugEnabled())
            LOG.debug(arguments);
    }

    @Override
    public void accept(BusinessOperationInvoker operationInvoker) {
        LOG.debug("Enter.");
        arguments.forEach((argument) -> createInput(argument).accept(operationInvoker));
        LOG.debug("Exit.");
    }

    private ThingInput createInput(String argument) {
        return new ThingInput(argument);
    }
}
