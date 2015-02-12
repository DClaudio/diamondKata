package runThree;

import org.junit.Test;
import runThree.Diamond;

import java.util.List;

import static com.shazam.shazamcrest.MatcherAssert.assertThat;
import static com.shazam.shazamcrest.matcher.Matchers.sameBeanAs;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static runThree.Diamond.newDiamond;

/**
 * Created by claudio.david on 12/02/2015.
 */
public class Diamond3AcceptanceTest {

    @Test
    public void createsDiamondSevenBySevenForD() {
        List expectedRows = asList(
                "   A   ",
                "  B B  ",
                " C   C ",
                "D     D",
                " C   C ",
                "  B B  ",
                "   A   "
        );

        Diamond diamond = newDiamond('D');

        assertThat(diamond.asListOfRows(), is(sameBeanAs(expectedRows)));
    }
}
