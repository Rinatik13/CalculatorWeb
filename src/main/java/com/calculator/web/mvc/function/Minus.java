package com.calculator.web.mvc.function;

public class Minus implements MyFunction{
    @Override
    public long functionStart(long x, long y) {
        return x-y;
    }
}
