package com.beyond.restock_machine.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MachineStorage {
    private final List<String> snacks;

    public MachineStorage(List<String> snacks) {
        this.snacks = snacks;
    }

    public List<String> getSnacks() {
        return snacks;
    }
}
