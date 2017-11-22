package com.jamesladdcode.main;

import com.jamesladdcode.business.BusinessInput;
import com.jamesladdcode.business.BusinessProcess;
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
        LOG.trace("Setup ...");
    }

    @Provides
    ErrorOutput provideErrorOutput() {
        LOG.trace("...");
        return new ErrorOutput();
    }

    @Provides
    Service provideService(BusinessInput input,
                           BusinessProcess process,
                           BusinessOutput output,
                           ErrorOutput errorOutput) {
        LOG.trace("...");
        return new MainService(input, process, output, errorOutput);
    }
}
