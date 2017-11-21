package com.jamesladdcode.business;

@FunctionalInterface
public interface BusinessInput {

    void accept(BusinessOperationInvoker operationInvoker);
}
