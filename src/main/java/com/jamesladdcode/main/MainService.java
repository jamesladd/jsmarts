package com.jamesladdcode.main;

import com.jamesladdcode.business.BusinessInput;
import com.jamesladdcode.business.BusinessProcess;
import com.jamesladdcode.service.BusinessProcessInvoker;
import com.jamesladdcode.business.BusinessOutput;
import com.jamesladdcode.service.ErrorOutput;
import com.jamesladdcode.service.Service;
import org.apache.log4j.Logger;

public class MainService implements Service {

    private static final Logger LOG = Logger.getLogger(MainService.class);

    private final BusinessInput input;
    private final BusinessProcess process;
    private final BusinessOutput output;
    private final ErrorOutput errorOutput;

    MainService(BusinessInput input,
                BusinessProcess process,
                BusinessOutput output,
                ErrorOutput errorOutput) {
        this.input = input;
        this.process = process;
        this.output = output;
        this.errorOutput = errorOutput;
    }

    @Override
    public void execute() {
        LOG.trace("Enter.");
        input.apply(process());
        LOG.trace("Exit.");
    }

    private BusinessProcessInvoker process() {
        return (transformedInput) -> {
            try {
                process.execute(transformedInput, output);
            } catch (Exception e) {
                LOG.error(e);
                errorOutput.accept(e);
            }
        };
    }
}
