package com.jamesladdcode.business;

@FunctionalInterface
public interface BusinessOperation {

    void accept(BusinessInput input, BusinessOutput output);
}
