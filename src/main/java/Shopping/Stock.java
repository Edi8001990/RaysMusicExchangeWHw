package Shopping;


import Instruments.Instrument;

import java.util.ArrayList;

public class Stock extends Shop{

    private ArrayList<Instrument> stocks;

    public Stock(){

        this.stocks = new ArrayList<Instrument>();
    }

    public int stockCheck() {
       return this.stocks.size();
    }


    public void addToStock(Instrument instrument1) {
        this.stocks.add(instrument1);

    }


    public void removeFromStock(Instrument instrument3) {
        this.stocks.remove(instrument3);
    }




}
