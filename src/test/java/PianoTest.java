import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano1;
    Piano piano2;
    Piano piano3;

    @Before

    public void before(){
        piano1 = new Piano("Grand Piano", 88);
        piano2 = new Piano("Upright Piano", 88);
        piano3 = new Piano("Electronic Keyboard", 61);
    }

    @Test
    public void checkPianoName(){
        assertEquals("Grand Piano", piano1.getName());
        assertEquals("Upright Piano", piano2.getName());
        assertEquals("Electronic Keyboard", piano3.getName());
    }

    @Test
    public void checkPianosKeysAmount(){
        assertEquals(88, piano1.getKeysNumber());
        assertEquals(88, piano2.getKeysNumber());
        assertEquals(61, piano3.getKeysNumber());
    }

    @Test
    public void checkIfPianoPlays(){
        assertEquals("I'm playing music from Grand Piano", piano1.play("Grand Piano"));
        assertEquals("I'm playing music from Upright Piano", piano2.play("Upright Piano"));
        assertEquals("I'm playing music from Electronic Keyboard", piano3.play("Electronic Keyboard"));
    }

}
