package com.beyond.bizarre_clock.repository;

import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class BizarreClockRepository {
    private int currentHour;


    private Set<Integer> bizarreHours;

    public BizarreClockRepository() {
        currentHour = 0;
        bizarreHours = Set.of(0, 11, 22);
    }

    public int getCurrentHour() {
        return currentHour;
    }

    public void setCurrentHour(int currentHour) {
        this.currentHour = currentHour;
    }

    public Set<Integer> getBizarreHours() {
        return bizarreHours;
    }
}
