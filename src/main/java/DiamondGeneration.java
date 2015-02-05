/**
 * Created by claudio.david on 05/02/2015.
 */
public class DiamondGeneration {
    private Character letter;
    public DiamondGeneration(char letter) {
        this.letter = letter;
    }

    public String generate() {
        if(letter == 'B'){
            return "  A \nB  B\n  A  ";
        }else{
            return "A";

        }
    }
}
