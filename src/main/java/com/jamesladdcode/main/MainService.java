package com.jamesladdcode.main;

import com.jamesladdcode.business.BusinessInput;
import com.jamesladdcode.business.BusinessOperation;
import com.jamesladdcode.business.BusinessOperationInvoker;
import com.jamesladdcode.business.BusinessOutput;
import com.jamesladdcode.service.ErrorOutput;
import com.jamesladdcode.service.Service;
import org.apache.log4j.Logger;

public class MainService implements Service {

    private static final Logger LOG = Logger.getLogger(MainService.class);

    private final BusinessInput input;
    private final BusinessOperation operation;
    private final BusinessOutput output;
    private final ErrorOutput errorOutput;

    MainService(BusinessInput input, BusinessOperation operation, BusinessOutput output, ErrorOutput errorOutput) {
        this.input = input;
        this.operation = operation;
        this.output = output;
        this.errorOutput = errorOutput;
    }

    @Override
    public void execute() {
        LOG.debug("Enter.");
        input.accept(operation());
        LOG.debug("Exit.");
    }

    private BusinessOperationInvoker operation() {
        return (transformedInput) -> {
            try {
                operation.accept(transformedInput, output);
            } catch (RuntimeException e) {
                LOG.error(e);
                errorOutput.accept(e);
            }
        };
    }
}
