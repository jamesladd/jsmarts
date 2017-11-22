package com.jamesladdcode.business;

@FunctionalInterface
public interface BusinessProcess {

    void execute(BusinessInput input, BusinessOutput output);
}
