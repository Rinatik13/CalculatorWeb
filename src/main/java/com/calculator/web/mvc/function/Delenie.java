package com.calculator.web.mvc.function;

public class Delenie implements MyFunction{
    @Override
    public long functionStart(long x, long y) {
        return x/y;
    }
}
