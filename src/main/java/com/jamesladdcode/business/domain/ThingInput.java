package com.jamesladdcode.business.domain;

import com.jamesladdcode.business.BusinessInput;
import com.jamesladdcode.business.BusinessOperationInvoker;
import com.jamesladdcode.CommandLineArguments;
import org.apache.log4j.Logger;

public class ThingInput implements BusinessInput {

    private static final Logger LOG = Logger.getLogger(ThingInput.class);

    private final CommandLineArguments arguments;

    ThingInput(CommandLineArguments arguments) {
        this.arguments = arguments;
        if (LOG.isDebugEnabled())
            LOG.debug(arguments);
    }

    @Override
    public void accept(BusinessOperationInvoker operationInvoker) {
        LOG.debug("Enter.");
        operationInvoker.accept(this);
        LOG.debug("Exit.");
    }
}
