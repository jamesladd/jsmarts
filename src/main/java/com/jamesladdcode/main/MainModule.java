package com.jamesladdcode.main;

import com.jamesladdcode.business.BusinessInput;
import com.jamesladdcode.business.BusinessOperation;
import com.jamesladdcode.business.BusinessOutput;
import com.jamesladdcode.business.domain.ThingModule;
import com.jamesladdcode.service.ErrorOutput;
import com.jamesladdcode.service.Service;
import dagger.Module;
import dagger.Provides;
import org.apache.log4j.Logger;

@Module(includes = {ThingModule.class})
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
    Service provideService(BusinessInput input, BusinessOperation operation, BusinessOutput output, ErrorOutput errorOutput) {
        LOG.debug("...");
        return new MainService(input, operation, output, errorOutput);
    }
}
