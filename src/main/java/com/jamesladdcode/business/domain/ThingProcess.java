package com.jamesladdcode.business.domain;

import com.jamesladdcode.business.BusinessInput;
import com.jamesladdcode.business.BusinessProcess;
import com.jamesladdcode.business.BusinessOutput;
import org.apache.log4j.Logger;

public class ThingProcess implements BusinessProcess {

    private static final Logger LOG = Logger.getLogger(ThingProcess.class);

    @Override
    public void execute(BusinessInput input, BusinessOutput output) {
        if (LOG.isDebugEnabled())
            LOG.debug("Enter: " + input);
        LOG.trace("Exit.");
    }
}
