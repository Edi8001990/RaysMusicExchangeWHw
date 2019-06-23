import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {



     Guitar guitar1;
     Guitar guitar2;
     Guitar guitar3;

 @Before

 public void before(){
   guitar1 = new Guitar("Acoustic guitar", 6);
   guitar2 = new Guitar("Bass guitar", 4);
   guitar3 = new Guitar("Electric guitar", 10);
 }

 @Test
    public void checkGuitarName(){
     assertEquals("Acoustic guitar", guitar1.getName());
     assertEquals("Bass guitar", guitar2.getName());
     assertEquals("Electric guitar", guitar3.getName());
 }

 @Test
    public void checkGuitarsStringsAmount(){
     assertEquals(6, guitar1.getStringsNumber());
     assertEquals(4, guitar2.getStringsNumber());
     assertEquals(10, guitar3.getStringsNumber());
 }

 @Test
    public void checkIfGuitarPlays(){
     assertEquals("I'm playing music from Acoustic guitar" , guitar1.play("Acoustic guitar"));
     assertEquals("I'm playing music from Bass guitar" , guitar2.play("Bass guitar"));
     assertEquals("I'm playing music from Electric guitar" , guitar3.play("Electric guitar"));
 }

}
