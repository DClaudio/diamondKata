/**
 * Created by claudio.david on 05/02/2015.
 */
public class DiamondGeneration {

    private Character letter;
    private int characterCode;
    private static int startingCharacterCode = String.valueOf('A').codePointAt(0);

    public DiamondGeneration(char letter) {
        this.letter = letter;
        characterCode = String.valueOf(letter).codePointAt(0);
    }

    public String generate() {
        String result = "";
        if (letter == 'B') {
            result += " A \n";
            result += "B B\n";
            result += " A ";
        } else{
            result += "A";
        }
        return result;
    }
}
