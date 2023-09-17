package academy.beyondeducation.part3.optional.service;

import academy.beyondeducation.part3.optional.data.Coin;
import academy.beyondeducation.part3.optional.data.CointType;

import java.util.ArrayList;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        ArrayList<Coin> coins = new ArrayList<>();
        coins.add(new Coin(CointType.CENT, 1));
        coins.add(new Coin(CointType.CENT, 2));
        coins.add(new Coin(CointType.CENT, 5));
        coins.add(new Coin(CointType.CENT, 10));
        coins.add(new Coin(CointType.CENT, 20));
        coins.add(new Coin(CointType.CENT, 50));
        coins.add(new Coin(CointType.EURO, 1));
        coins.add(new Coin(CointType.EURO, 2));
        coins.add(new Coin(CointType.EURO, 5));
        coins.add(new Coin(CointType.EURO, 10));
        coins.add(new Coin(CointType.EURO, 20));
        coins.add(new Coin(CointType.EURO, 50));
        coins.add(new Coin(CointType.EURO, 100));
        coins.add(new Coin(CointType.EURO, 200));
        coins.add(new Coin(CointType.EURO, 500));
        //duplicates starting
        coins.add(new Coin(CointType.EURO, 100));
        coins.add(new Coin(CointType.EURO, 200));
        coins.add(new Coin(CointType.EURO, 500));
        CoinManager coinManager = new CoinManager();
        Set<Coin> uniqueCoins = coinManager.getUniqueCoins(coins);
        CoinOutput coinOutput = new CoinOutput();
        coinOutput.printCoins(uniqueCoins);
    }
}
