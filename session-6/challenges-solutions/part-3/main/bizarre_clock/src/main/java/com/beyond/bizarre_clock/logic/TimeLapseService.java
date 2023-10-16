package com.beyond.bizarre_clock.logic;

import com.beyond.bizarre_clock.repository.BizarreClockRepository;
import org.springframework.stereotype.Service;

@Service
public class TimeLapseService {
    private final BizarreClockRepository bizarreClockRepository;

    public TimeLapseService(BizarreClockRepository bizarreClockRepository) {
        this.bizarreClockRepository = bizarreClockRepository;
    }

    public void increaseTimer() {
        int currentHour = bizarreClockRepository.getCurrentHour();
        int newCurrentHour = (currentHour + 1) % 24;
        bizarreClockRepository.setCurrentHour(newCurrentHour);
        System.out.println("current hour = " + newCurrentHour);
        if(bizarreClockRepository.getBizarreHours().contains(newCurrentHour)) {
            System.out.println("ding");
        }
    }
}
