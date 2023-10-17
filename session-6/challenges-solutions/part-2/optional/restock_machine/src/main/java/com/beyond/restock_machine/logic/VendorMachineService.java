package com.beyond.restock_machine.logic;

import com.beyond.restock_machine.repository.MachineStorage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorMachineService {
    private final MachineStorage machineStorage;

    public VendorMachineService(MachineStorage machineStorage) {
        this.machineStorage = machineStorage;
    }

    public void add(String snack) {
        machineStorage.getSnacks().add(snack);
    }

    public String getSnack(int numericCode) {
        return machineStorage.getSnacks().remove(numericCode);
    }

    public List<String> getAllSnacks() {
        return machineStorage.getSnacks();
    }
}
