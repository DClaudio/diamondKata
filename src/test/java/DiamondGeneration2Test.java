/**
 * Created by claudio.david on 05/02/2015.
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by claudio.david on 05/02/2015.
 */
public class DiamondGeneration2Test {

    @Test
    public void generateForATest(){
        DiamondGeneration2 diaGen = new DiamondGeneration2('A');
        String expectedResult = "A\n";
        assertEquals("Assert for A letter diamond", expectedResult, diaGen.generate());
    }

    @Test
    public void generateForBTest(){
        DiamondGeneration2 diaGen = new DiamondGeneration2('B');
        String expectedResult = " A \n"+
                                "B B\n"+
                                " A \n";
        assertEquals("Assert for B letter diamond", expectedResult, diaGen.generate());
    }

    @Test
    public void generateForCTest(){
        DiamondGeneration2 diaGen = new DiamondGeneration2('C');
        String expectedResult = "  A  \n"+
                                " B B \n"+
                                "C   C\n"+
                                " B B \n"+
                                "  A  \n";
        assertEquals("Assert for C letter diamond", expectedResult, diaGen.generate());
    }

    @Test
    public void generateForDTest(){
        DiamondGeneration2 diaGen = new DiamondGeneration2('D');
        String expectedResult = "   A   \n"+
                                "  B B  \n"+
                                " C   C \n"+
                                "D     D\n"+
                                " C   C \n"+
                                "  B B  \n"+
                                "   A   \n";
        assertEquals("Assert for D letter diamond", expectedResult, diaGen.generate());
    }
}
