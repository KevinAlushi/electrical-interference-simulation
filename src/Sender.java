public class Sender {

    //Turns a string into ASCII values
    int[] asciiConversion(String word){
        int[] asciiValues = new int[word.length()];
        for (int i = 0; i < word.length(); i++){
            asciiValues[i] = (int) word.charAt(i);
        }
        return asciiValues;
    }

    //Turns the ASCII values into binary
    int[] toBinary(int num){
        int[] binary = new int[8];
        for(int i = 0; i < 8; i++){
            binary[i] = num % 2;
            num = num / 2;
        }
        //Since the bits are flipped when you do the math,
        //we use this to flip them corectlly
        for(int i = 0; i < binary.length / 2; i++){
            int temp = binary[i];
            binary[i] = binary[binary.length - 1 -i];
            binary[binary.length - 1 - i] = temp;
        }
        return binary;
    }

}
