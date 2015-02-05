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
        int currentCharacterCode = characterCode;
        if(letter == 'A'){
            result.append(letter+"\n");
        }else{
            result.append(letter + genWS(middleLineSpaces) + letter + "\n");
            for(int i=0,padding=1; i<characterCount-1; i++,padding++){
                middleLineSpaces-=2; currentCharacterCode--;
                String line = genWS(padding)+ (char)currentCharacterCode + genWS(middleLineSpaces) + (char)currentCharacterCode + genWS(padding) + "\n";
                result.insert(0,line).append(line);
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
