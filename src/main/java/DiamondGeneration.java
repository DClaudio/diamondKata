/**
 * Created by claudio.david on 05/02/2015.
 */
public class DiamondGeneration {

    private Character letter;
    private int characterCode;
    private static int STARTING_CHARACTER = String.valueOf('A').codePointAt(0);

    public DiamondGeneration(char letter) {
        this.letter = letter;
        characterCode = String.valueOf(letter).codePointAt(0);
    }

    public String generate() {
        StringBuilder result = new StringBuilder();
        int currentCharacter = STARTING_CHARACTER;
        int characterRank = characterCode - STARTING_CHARACTER;
        int wsPaddingNumber = characterRank;
        if(letter == 'A'){
            result.append(generateWS(wsPaddingNumber)).append((char)currentCharacter)
                  .append(generateWS(wsPaddingNumber)).append("\n");
        }else if(letter == 'C'){
            result.append(generateWS(wsPaddingNumber)).append((char)currentCharacter)
                    .append(generateWS(wsPaddingNumber)).append("\n");
            
            int wsCenterNumber = -1;
            for(int i=0; i < 2; i++){
                wsPaddingNumber--; currentCharacter++; wsCenterNumber+=2;
                result.append(generateWS(wsPaddingNumber)).append((char)currentCharacter)
                      .append(generateWS(wsCenterNumber)).append((char)currentCharacter)
                      .append(generateWS(wsPaddingNumber)).append("\n");
            }
            wsPaddingNumber++; currentCharacter--; wsCenterNumber-=2;
            result.append(generateWS(wsPaddingNumber)).append((char)currentCharacter).append(generateWS(wsCenterNumber)).append((char)currentCharacter).append(generateWS(wsPaddingNumber)).append("\n");
            wsPaddingNumber++; currentCharacter--;
            result.append(generateWS(wsPaddingNumber)).append((char)currentCharacter).append(generateWS(wsPaddingNumber)).append("\n");

        }else{
            result.append(generateWS(1)).append("A").append(generateWS(1)).append("\n");
            result.append(generateWS(0)).append("B").append(generateWS(1)).append("B").append(generateWS(0)).append("\n");
            result.append(generateWS(1)).append("A").append(generateWS(1)).append("\n");
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
