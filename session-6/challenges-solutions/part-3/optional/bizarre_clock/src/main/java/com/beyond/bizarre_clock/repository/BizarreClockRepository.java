package com.beyond.bizarre_clock.repository;

import com.beyond.bizarre_clock.logic.BizarreHourContainer;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class BizarreClockRepository {
    private int currentHour;

    private final BizarreHourContainer bizarreHoursContainer;

    public BizarreClockRepository(BizarreHourContainer bizarreHoursContainer) {
        currentHour = 0;
        this.bizarreHoursContainer = bizarreHoursContainer;
    }

    public int getCurrentHour() {
        return currentHour;
    }

    public void setCurrentHour(int currentHour) {
        this.currentHour = currentHour;
    }

    public Set<Integer> getBizarreHours() {
//        return bizarreHours;
        return bizarreHoursContainer.getBizarreHours();
    }
}
