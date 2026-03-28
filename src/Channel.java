public class Channel {

    //Flips the bits randomly simulating interferences
    int[] transmit(int[] bits){
        for(int i = 0; i < bits.length; i++){
            if(Math.random() < 0.1){
                if(bits[i] == 1){
                    bits[i] = 0;
                }else{
                    bits[i] = 1;
                }
            }
        }
        return bits;
    }

}
