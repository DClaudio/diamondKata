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
        StringBuilder result = new StringBuilder();
        int characterCount = characterCode - STARTING_CHARACTER_CODE;
        int middleLineSpaces = 2 * (characterCount) - 1;
        if(letter == 'A'){
            result.append(letter+"\n");
        }else{
            result.append(letter + genWS(middleLineSpaces) + letter + "\n");
            for(int i=0; i<characterCount-1; i++){
                String line2 = " B B \n";
                result.insert(0,line2).append(line2);
            }
            String diamondsEdge = genWS(characterCount) + "A" + genWS(characterCount) + "\n";
            result.insert(0,diamondsEdge).append(diamondsEdge);

        }
        return result.toString();
    }

    private String genWS(int count){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<count; i++){
            result.append(" ");
        }
        return result.toString();
    }
}
