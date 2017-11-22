package com.jamesladdcode.business.domain;

import com.jamesladdcode.business.BusinessInput;
import com.jamesladdcode.business.BusinessOperation;
import com.jamesladdcode.business.BusinessOutput;
import org.apache.log4j.Logger;

public class ThingOperation implements BusinessOperation {

    private static final Logger LOG = Logger.getLogger(ThingOperation.class);

    @Override
    public void accept(BusinessInput input, BusinessOutput output) {
        LOG.debug("Enter: " + input);
        LOG.debug("Exit.");
    }
}
