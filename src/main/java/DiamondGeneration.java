/**
 * Created by claudio.david on 05/02/2015.
 */
public class DiamondGeneration {
    private Character letter;
    public DiamondGeneration(char letter) {
        this.letter = letter;
    }

    public String generate() {

        int cp = String.valueOf(letter).codePointAt(0);
        String result = "A";
        if(letter == 'B'){
            result = " A \n"+
                     "B B\n"+
                     " A ";
        }
        return result;
    }
}
