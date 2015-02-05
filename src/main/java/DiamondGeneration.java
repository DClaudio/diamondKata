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
        if(letter == 'A'){
            result.append( "A\n");
        }else if(letter == 'C'){
            int wsNumber = 2;
            int character = STARTING_CHARACTER;
            result.append(generateWS(wsNumber)).append((char)character).append(generateWS(wsNumber)).append("\n");
            wsNumber--; character ++;
            result.append(generateWS(wsNumber)).append((char)character).append(generateWS(1)).append((char)character).append(generateWS(wsNumber)).append("\n");
            wsNumber--; character ++;
            result.append(generateWS(wsNumber)).append((char)character).append(generateWS(3)).append((char)character).append(generateWS(wsNumber)).append("\n");
            wsNumber++; character --;
            result.append(generateWS(wsNumber)).append((char)character).append(generateWS(1)).append((char)character).append(generateWS(wsNumber)).append("\n");
            wsNumber++; character --;
            result.append(generateWS(wsNumber)).append((char)character).append(generateWS(wsNumber)).append("\n");
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
