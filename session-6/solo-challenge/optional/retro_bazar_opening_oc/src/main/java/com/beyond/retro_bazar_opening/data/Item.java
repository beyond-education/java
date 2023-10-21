package com.beyond.retro_bazar_opening.data;

import java.util.Objects;

public record Item(String name, double price) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name +
                ", " + price +
                " EUR";
    }
}
