package com.jamesladdcode.service;

import com.jamesladdcode.business.BusinessInput;

@FunctionalInterface
public interface BusinessProcessInvoker {

    void process(BusinessInput input);
}
