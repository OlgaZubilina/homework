package ru.stepup.payments.mobile;

import com.sun.jdi.connect.Connector;

public interface Measurable {
    double getLength();
    default double getLength(String str){
        return str.length();
    }
}
