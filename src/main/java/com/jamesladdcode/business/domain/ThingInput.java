package com.jamesladdcode.business.domain;

import com.jamesladdcode.business.BusinessInput;
import com.jamesladdcode.business.BusinessOperationInvoker;
import org.apache.log4j.Logger;

class ThingInput implements BusinessInput {

    private static final Logger LOG = Logger.getLogger(ThingInput.class);

    private final String argument;

    ThingInput(String argument) {
        this.argument = argument;
        if (LOG.isDebugEnabled())
            LOG.debug(argument);
    }

    public String toString() {
        return argument;
    }

    @Override
    public void accept(BusinessOperationInvoker operationInvoker) {
        LOG.debug("Enter.");
        operationInvoker.accept(this);
        LOG.debug("Exit.");
    }
}
