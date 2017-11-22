package com.jamesladdcode.business.domain;

import com.jamesladdcode.CommandLineArguments;
import com.jamesladdcode.business.BusinessInput;
import com.jamesladdcode.service.BusinessProcessInvoker;
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
    public void apply(BusinessProcessInvoker businessProcess) {
        LOG.trace("Enter.");
        arguments.forEach((argument) -> processWith(argument, businessProcess));
        LOG.trace("Exit.");
    }

    private void processWith(String argument, BusinessProcessInvoker businessProcess) {
        createInput(argument).apply(businessProcess);
    }

    private ThingInput createInput(String argument) {
        return new ThingInput(argument);
    }
}
