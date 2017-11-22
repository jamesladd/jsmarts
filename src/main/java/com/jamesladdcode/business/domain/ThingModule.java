package com.jamesladdcode.business.domain;

import com.jamesladdcode.business.BusinessInput;
import com.jamesladdcode.business.BusinessProcess;
import com.jamesladdcode.business.BusinessOutput;
import com.jamesladdcode.CommandLineArguments;
import dagger.Module;
import dagger.Provides;
import org.apache.log4j.Logger;

@Module(includes = {})
public class ThingModule {

    private static final Logger LOG = Logger.getLogger(ThingModule.class);
    static {
        LOG.trace("Setup ...");
    }

    @Provides
    BusinessProcess provideBusinessProcess() {
        LOG.trace("...");
        return new ThingProcess();
    }

    @Provides
    BusinessOutput provideBusinessOutput() {
        LOG.trace("...");
        return new ThingOutput();
    }

    @Provides
    BusinessInput provideBusinessInput(CommandLineArguments arguments) {
        LOG.trace("...");
        return new ThingsInput(arguments);
    }
}
