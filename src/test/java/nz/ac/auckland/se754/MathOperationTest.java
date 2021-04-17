package nz.ac.auckland.se754;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathOperationTest {


    @Test
    public void testMax(){
        assertEquals(20, new MathOperation().max(10,20));
    }



}