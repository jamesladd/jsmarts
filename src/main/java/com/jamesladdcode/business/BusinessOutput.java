package com.jamesladdcode.business;

@FunctionalInterface
public interface BusinessOutput {

    void accept(BusinessOutput output);
}
