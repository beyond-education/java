package com.beyond.exclusive_club_vip.repository;

import com.beyond.exclusive_club_vip.data.VIPGuest;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class VIPGuestRepository {
    private final Set<VIPGuest> guests = new HashSet<>();

    public Set<VIPGuest> getGuests() {
        return guests;
    }
}
