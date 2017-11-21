package com.jamesladdcode.service;

import org.apache.log4j.Logger;

public class ErrorOutput {

    private static final Logger LOG = Logger.getLogger(ErrorOutput.class);

    public void accept(Object error) {
        LOG.error(error);
    }
}
