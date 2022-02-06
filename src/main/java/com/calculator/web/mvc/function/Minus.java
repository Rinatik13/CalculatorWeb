package com.calculator.web.mvc.function;

//реализуем функцию вычитания

public class Minus implements MyFunction{
    @Override
    public long functionStart(long x, long y) {
        return x-y;
    }
}
