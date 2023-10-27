package com.beyond.exclusive_club_vip.controller;

import com.beyond.exclusive_club_vip.data.VIPGuest;
import com.beyond.exclusive_club_vip.exception.GuestNotFoundException;
import com.beyond.exclusive_club_vip.logic.VIPGuestService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("guests/vip")
public class VIPGuestController {
    private final VIPGuestService vipGuestService;

    public VIPGuestController(VIPGuestService vipGuestService) {
        this.vipGuestService = vipGuestService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    VIPGuest add(@RequestBody String name) {
        return vipGuestService.addVIPGuest(name);
    }

    @GetMapping("{name}")
    @ResponseStatus(HttpStatus.FOUND)
    VIPGuest get(@PathVariable String name) {
        Optional<VIPGuest> vipGuest = vipGuestService.findVIPGuest(name);
        if(vipGuest.isEmpty()) {
            throw new GuestNotFoundException();
        }
        return vipGuest.get();
    }

    @DeleteMapping("{name}")
    @ResponseStatus(HttpStatus.OK)
    boolean delete(@PathVariable String name) {
        boolean isRemoved = vipGuestService.deleteVIPGuest(name);
        if(!isRemoved) {
            throw new GuestNotFoundException();
        }
        return isRemoved;
    }

}
