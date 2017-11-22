package com.jamesladdcode.business.domain;

import com.jamesladdcode.business.BusinessInput;
import com.jamesladdcode.service.BusinessProcessInvoker;
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
    public void apply(BusinessProcessInvoker businessProcess) {
        LOG.trace("Enter.");
        businessProcess.process(this);
        LOG.trace("Exit.");
    }
}
