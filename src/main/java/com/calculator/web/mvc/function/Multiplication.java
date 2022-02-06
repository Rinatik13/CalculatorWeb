package com.calculator.web.mvc.function;

// реализуем функцию умножения

public class Multiplication implements MyFunction{
    @Override
    public long functionStart(long x, long y) {
        return x*y;
    }
}
