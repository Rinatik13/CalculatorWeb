package com.calculator.web.mvc.function;

public class Multiplication implements MyFunction{
    @Override
    public long functionStart(long x, long y) {
        return x-y;
    }
}
