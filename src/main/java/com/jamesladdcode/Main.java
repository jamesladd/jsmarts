package com.jamesladdcode;

import com.jamesladdcode.main.DaggerMainConfig;
import com.jamesladdcode.service.Service;
import org.apache.log4j.Logger;

public class Main {

    private static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.debug("Enter.");
        serviceWith(args).execute();
        LOG.debug("Exit.");
    }

    private static Service serviceWith(String[] args) {
        return DaggerMainConfig.builder()
                .arguments(new CommandLineArguments(args))
                .build()
                .service();
    }
}
