package com.beyond.bizarre_clock.repository;

import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class BizarreClockRepository {
    private int currentHour = 0;

    private final Set<Integer> bizarreHours;

    public BizarreClockRepository(Set<Integer> bizarreHours) {
        this.bizarreHours = bizarreHours;
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
