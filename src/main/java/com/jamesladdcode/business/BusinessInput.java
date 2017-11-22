package com.jamesladdcode.business;

import com.jamesladdcode.service.BusinessProcessInvoker;

@FunctionalInterface
public interface BusinessInput {

    void apply(BusinessProcessInvoker processInvoker);
}
