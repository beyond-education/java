package com.beyond.retro_bazar_arrangment.data;

public record Item(String name, double price) {
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
