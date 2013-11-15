package Romanos;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumeroTest {
    
    public NumeroTest() {
    }
    
    @Test
    public void testARomano(){
        System.out.println("Conversion de decimal a romano");
        Numero r = new Numero();
        assertEquals("IV", r.Decimal2Romano(4));
    }
    
    @Test
    public void testADecimal(){
        System.out.println("Conversion de romano a decimal");
        Numero r = new Numero();
        assertEquals(41, r.Romano2Decimal("XLI"));
    }
}
