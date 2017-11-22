package com.jamesladdcode.business.domain;

import com.jamesladdcode.business.BusinessOutput;
import org.apache.log4j.Logger;

public class ThingOutput implements BusinessOutput {

    private static final Logger LOG = Logger.getLogger(ThingOutput.class);

    @Override
    public void accept(BusinessOutput output) {
        LOG.debug("Enter.");
        LOG.debug("Exit.");
    }
}
