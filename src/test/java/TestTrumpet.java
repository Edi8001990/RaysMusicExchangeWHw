import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTrumpet {

    Trumpet trumpet1;
    Trumpet trumpet2;
    Trumpet trumpet3;

    @Before

    public void before(){
        trumpet1 = new Trumpet("Piccolo trumpet", 4);
        trumpet2 = new Trumpet("Saxophone", 4);
        trumpet3 = new Trumpet("Trombone", 3);
    }

    @Test
    public void checkTrumpetName(){
        assertEquals("Piccolo trumpet", trumpet1.getName());
        assertEquals("Saxophone", trumpet2.getName());
        assertEquals("Trombone", trumpet3.getName());
    }

    @Test
    public void checkValvesAmount(){
        assertEquals(4, trumpet1.getValvesNumber());
        assertEquals(4, trumpet2.getValvesNumber());
        assertEquals(3, trumpet3.getValvesNumber());
    }

    @Test
    public void checkIfTrumpetCanPlay(){
        assertEquals("I'm playing music from Piccolo trumpet" , trumpet1.play("Piccolo trumpet"));
        assertEquals("I'm playing music from Saxophone" , trumpet2.play("Saxophone"));
        assertEquals("I'm playing music from Trombone" , trumpet3.play("Trombone"));
    }

}
