package com.jamesladdcode.main;

import com.jamesladdcode.business.BusinessInput;
import com.jamesladdcode.business.BusinessOperation;
import com.jamesladdcode.business.BusinessOutput;
import com.jamesladdcode.example.ThingInput;
import com.jamesladdcode.example.ThingOperation;
import com.jamesladdcode.example.ThingOutput;
import com.jamesladdcode.service.CommandLineArguments;
import com.jamesladdcode.service.ErrorOutput;
import com.jamesladdcode.service.Service;
import dagger.Module;
import dagger.Provides;
import org.apache.log4j.Logger;

@Module(includes = {})
class MainModule {

    private static final Logger LOG = Logger.getLogger(MainModule.class);
    static {
        LOG.debug("Setup ...");
    }

    @Provides
    ErrorOutput provideErrorOutput() {
        LOG.debug("...");
        return new ErrorOutput();
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
    CommandLineArguments provideCommandLineArguments(String[] arguments) {
        LOG.debug("...");
        return new CommandLineArguments(arguments);
    }

    @Provides
    BusinessInput provideBusinessInput(CommandLineArguments arguments) {
        LOG.debug("...");
        return new ThingInput(arguments);
    }

    @Provides
    Service provideService(BusinessInput input, BusinessOperation operation, BusinessOutput output, ErrorOutput errorOutput) {
        LOG.debug("...");
        return new MainService(input, operation, output, errorOutput);
    }
}
