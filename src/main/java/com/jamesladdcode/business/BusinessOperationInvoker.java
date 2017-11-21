package com.jamesladdcode.business;

@FunctionalInterface
public interface BusinessOperationInvoker {

    void accept(BusinessInput input);
}
