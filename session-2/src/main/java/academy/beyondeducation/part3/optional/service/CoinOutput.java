package academy.beyondeducation.part3.optional.service;

import academy.beyondeducation.part3.optional.data.Coin;

import java.util.Set;

public class CoinOutput {
    public void printCoins(Set<Coin> coins) {
        for(Coin coin : coins) {
            System.out.println("coin = " + coin);
        }
    }
}
