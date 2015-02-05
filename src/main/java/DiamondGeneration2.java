/**
 * Created by claudio.david on 05/02/2015.
 */
public class DiamondGeneration2 {

    private Character letter;
    private int characterCode;
    private static int STARTING_CHARACTER_CODE = String.valueOf('A').codePointAt(0);

    public DiamondGeneration2(char letter) {
        this.letter = letter;
        characterCode = String.valueOf(letter).codePointAt(0);
    }

    public String generate() {
        return null;
    }
}
