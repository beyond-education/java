package com.beyond.springlayering.logic;

import com.beyond.springlayering.data.ClothRepository;
import org.springframework.stereotype.Service;

@Service
public class ClothService {
    private final ClothRepository clothRepository;

    public ClothService(ClothRepository clothRepository) {
        this.clothRepository = clothRepository;
    }

    public String getCloth() {
        clothRepository.getClothes().add("Shoes");
        clothRepository.getClothes().add("Jacket");
        clothRepository.getClothes().add("Pants");
        clothRepository.getClothes().add("Stalkings");

        return clothRepository.getClothes().remove(1);
    }
}
