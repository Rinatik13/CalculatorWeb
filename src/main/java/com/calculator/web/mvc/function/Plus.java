package com.calculator.web.mvc.function;

// реализуем функцию сложения

public class Plus implements MyFunction{
    @Override
    public long functionStart(long x, long y) {
        return x+y;
    }
}
