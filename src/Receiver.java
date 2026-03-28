public class Receiver {

    //Turns the bits back into characters
    char toChar(int[] bits){
        int sum = 0;
        for(int i = 0; i < bits.length; i++){
            sum += bits[i] * (int) Math.pow(2, 7 - i);
        }
        return (char) sum;
    }

}
