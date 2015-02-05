/**
 * Created by claudio.david on 05/02/2015.
 */
public class DiamondGeneration {

    private Character letter;
    private int characterCode;
    private static int STARTING_CHARACTER_CODE = String.valueOf('A').codePointAt(0);

    public DiamondGeneration(char letter) {
        this.letter = letter;
        characterCode = String.valueOf(letter).codePointAt(0);
    }

    public String generate() {
        StringBuilder result = new StringBuilder();
        int currentCharacterCode = STARTING_CHARACTER_CODE;
        int characterRank = characterCode - STARTING_CHARACTER_CODE;
        int wsPaddingNumber = characterRank;
        int wsCenterNumber = -1;

        result.append(generateWS(wsPaddingNumber)).append((char)currentCharacterCode)
                .append(generateWS(wsPaddingNumber)).append("\n");

        if(letter != 'A') {
            for (int i = 0; i < characterRank; i++) {
                wsPaddingNumber-- ;currentCharacterCode++; wsCenterNumber += 2;
                result.append(generateWS(wsPaddingNumber)).append((char) currentCharacterCode)
                        .append(generateWS(wsCenterNumber)).append((char) currentCharacterCode)
                        .append(generateWS(wsPaddingNumber)).append("\n");
            }
            for(int i = characterRank -1; i > 0; i--){
                wsPaddingNumber++; currentCharacterCode--; wsCenterNumber -= 2;
                result.append(generateWS(wsPaddingNumber)).append((char) currentCharacterCode)
                        .append(generateWS(wsCenterNumber)).append((char) currentCharacterCode)
                        .append(generateWS(wsPaddingNumber)).append("\n");
            }
            wsPaddingNumber++; currentCharacterCode--;
            result.append(generateWS(wsPaddingNumber)).append((char)currentCharacterCode)
                    .append(generateWS(wsPaddingNumber)).append("\n");
        }
        return result.toString();
    }

    private String generateWS(int count){
        StringBuilder result = new StringBuilder();
        for(int i=0; i< count; i++){
            result.append(" ");
        }
        return result.toString();
    }
}
