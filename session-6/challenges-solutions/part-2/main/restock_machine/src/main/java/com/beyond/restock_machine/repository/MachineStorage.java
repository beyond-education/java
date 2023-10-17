package com.beyond.restock_machine.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MachineStorage {
    private final List<String> snacks = new ArrayList<>();

    public List<String> getSnacks() {
        return snacks;
    }
}
