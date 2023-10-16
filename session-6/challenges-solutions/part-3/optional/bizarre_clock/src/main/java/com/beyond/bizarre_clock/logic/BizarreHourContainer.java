package com.beyond.bizarre_clock.logic;

import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class BizarreHourContainer {
    private final Set<Integer> bizarreHours;

    public BizarreHourContainer() {
        bizarreHours = Set.of(0, 11, 22);
    }

    public Set<Integer> getBizarreHours() {
        return bizarreHours;
    }
}
