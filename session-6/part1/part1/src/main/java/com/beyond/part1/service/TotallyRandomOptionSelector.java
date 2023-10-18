package com.beyond.part1.service;

public class TotallyRandomOptionSelector {
    private final RandomOptionSelector pizzaSelector;
    private final RandomOptionSelector icecreamSelector;

    public TotallyRandomOptionSelector(RandomOptionSelector pizzaSelector, RandomOptionSelector icecreamSelector) {
        this.pizzaSelector = pizzaSelector;
        this.icecreamSelector = icecreamSelector;
    }

}
