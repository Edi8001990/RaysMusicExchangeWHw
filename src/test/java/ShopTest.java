
import Shopping.Item;
import Shopping.Stock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Stock stock;
    Item instrument1;
    Item instrument2;
    Item instrument3;

    @Before
    public void setUp(){
        stock = new Stock();
        instrument1 = new Item("Piccolo trumpet");
        instrument2 = new Item("Grand Piano");
        instrument3 = new Item("Acoustic guitar");
    }

    @Test
    public void stockListStartsFrom0(){
        assertEquals(0, stock.stockCheck());
    }

    @Test
    public void checkIfItemIsAddedToStock(){
        stock.addToStock(instrument1);
        stock.addToStock(instrument2);
        stock.addToStock(instrument3);
        assertEquals(3, stock.stockCheck());
    }

    @Test
    public void checkIfItemIsRemovedFromStock(){
        stock.addToStock(instrument1);
        stock.addToStock(instrument2);
        stock.removeFromStock(instrument3);
        assertEquals(2, stock.stockCheck());
    }
}
