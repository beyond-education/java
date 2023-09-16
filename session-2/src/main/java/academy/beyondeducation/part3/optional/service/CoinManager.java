package academy.beyondeducation.part3.optional.service;

import academy.beyondeducation.part3.optional.data.Coin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CoinManager {
    public Set<Coin> getUniqueCoins(ArrayList<Coin> coins) {
        Set<Coin> uniqueCoins = new HashSet<>();
        for(Coin coin : coins) {
            uniqueCoins.add(coin);
        }
        return uniqueCoins;
    }
}
