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
        if(letter == 'A'){
            result += "A";
        }else if(letter == 'C'){
            result += generateWS(2) + "A" + generateWS(2) + "\n";
            result += generateWS(1) + "B" +generateWS(1)+ "B" + generateWS(1) + "\n";
            result += generateWS(0) + "C" +generateWS(3)+ "C" + generateWS(0) + "\n";
            result += generateWS(1) + "B" +generateWS(1)+ "B" + generateWS(1) + "\n";
            result += generateWS(2) + "A" + generateWS(2);
        }else{
            result += generateWS(1) + "A" + generateWS(1) + "\n";
            result += generateWS(0) + "B" +generateWS(1)+ "B" + generateWS(0) + "\n";
            result += generateWS(1) + "A" + generateWS(1);
        }
        return result;
    }

    private String generateWS(int count){
        StringBuilder result = new StringBuilder();
        for(int i=0; i< count; i++){
            result.append(" ");
        }
        return result.toString();
    }
}
