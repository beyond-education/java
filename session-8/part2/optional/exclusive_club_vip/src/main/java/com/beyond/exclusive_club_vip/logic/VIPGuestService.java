package com.beyond.exclusive_club_vip.logic;

import com.beyond.exclusive_club_vip.data.VIPGuest;
import com.beyond.exclusive_club_vip.repository.VIPGuestRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VIPGuestService {

    private final VIPGuestRepository vipGuestRepository;

    public VIPGuestService(VIPGuestRepository vipGuestRepository) {
        this.vipGuestRepository = vipGuestRepository;
    }

    public VIPGuest addVIPGuest(String name) {
        VIPGuest vipGuest = new VIPGuest(name, 0);
        vipGuestRepository.getGuests().add(vipGuest);
        return vipGuest;
    }

    public Optional<VIPGuest> findVIPGuest(String name) {
        return vipGuestRepository.getGuests().stream()
                .filter(vipGuest -> vipGuest.getName().equals(name))
                .findFirst();
    }

    public boolean deleteVIPGuest(String name) {
        return vipGuestRepository.getGuests()
                .removeIf(vipGuest -> vipGuest.getName().equals(name));
    }
}
