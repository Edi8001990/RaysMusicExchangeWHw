package Shopping;

import Shopping.Stock;

import java.util.ArrayList;

public abstract class Shop implements ISell{

    private ArrayList<Stock> stocks;

    public Shop(){

        this.stocks = new ArrayList<Stock>();
    }

    public int stockCheck(){
        return this.stocks.size();
    }
}


