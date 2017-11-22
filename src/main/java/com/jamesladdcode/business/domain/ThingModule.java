package com.jamesladdcode.business.domain;

import com.jamesladdcode.business.BusinessInput;
import com.jamesladdcode.business.BusinessOperation;
import com.jamesladdcode.business.BusinessOutput;
import com.jamesladdcode.CommandLineArguments;
import dagger.Module;
import dagger.Provides;
import org.apache.log4j.Logger;

@Module(includes = {})
public class ThingModule {

    private static final Logger LOG = Logger.getLogger(ThingModule.class);
    static {
        LOG.debug("Setup ...");
    }

    @Provides
    BusinessOperation provideBusinessOperation() {
        LOG.debug("...");
        return new ThingOperation();
    }

    @Provides
    BusinessOutput provideBusinessOutput() {
        LOG.debug("...");
        return new ThingOutput();
    }

    @Provides
    BusinessInput provideBusinessInput(CommandLineArguments arguments) {
        LOG.debug("...");
        return new ThingInput(arguments);
    }
}
