import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by claudio.david on 05/02/2015.
 */
public class DiamondGenerationTest {

    @Test
    public void generateForATest(){
        DiamondGeneration diaGen = new DiamondGeneration('A');
        String expectedResult = "A\n";
        assertEquals("Assert for A letter diamond", expectedResult, diaGen.generate());
    }

    @Test
    public void generateForBTest(){
        DiamondGeneration diaGen = new DiamondGeneration('B');
        String expectedResult = " A \n"+
                                "B B\n"+
                                " A \n";
        assertEquals("Assert for B letter diamond", expectedResult, diaGen.generate());
    }

    @Test
    public void generateForCTest(){
        DiamondGeneration diaGen = new DiamondGeneration('C');
        String expectedResult = "  A  \n"+
                                " B B \n"+
                                "C   C\n"+
                                " B B \n"+
                                "  A  \n";
        assertEquals("Assert for C letter diamond", expectedResult, diaGen.generate());
    }
}
