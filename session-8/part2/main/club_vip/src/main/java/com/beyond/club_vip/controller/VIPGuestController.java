package com.beyond.club_vip.controller;

import com.beyond.club_vip.data.VIPGuest;
import com.beyond.club_vip.exception.GuestNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/guests/vip")
public class VIPGuestController {
    private final Set<VIPGuest> guests = new HashSet<>();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    VIPGuest add(@RequestBody VIPGuest vipGuest) {
        guests.add(vipGuest);
        return vipGuest;
    }

    @GetMapping("{name}")
    @ResponseStatus(HttpStatus.FOUND)
    VIPGuest find(@PathVariable String name) {
        VIPGuest guest = guests.stream()
                .filter(vipGuest -> vipGuest.getName().equals(name))
                .findFirst().orElseThrow(()->new GuestNotFoundException());
        return guest;
    }

    @DeleteMapping("{name}")
    @ResponseStatus(HttpStatus.OK)
    boolean delete(@PathVariable String name) {
        boolean isRemoved = guests.removeIf(vipGuest -> vipGuest.getName().equals(name));
        if(isRemoved) {
           return true;
        }
        throw new GuestNotFoundException();

    }
}
