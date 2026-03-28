import java.util.Scanner;
class Main{
    public static void main(String[] args){

        Sender sender = new Sender();
        Channel channel = new Channel();
        Receiver receiver = new Receiver();
        Scanner scanner = new Scanner(System.in);

        //Continue until typed FINISH
        while(true) {

            System.out.print("Type a message here or type 'FINISH' to end the program: ");
            String message = scanner.nextLine();

            if(message.equals("FINISH")){
                System.out.print("Goodbye!");
                break;
            }

            int nums[] = sender.asciiConversion(message);

            String received = "";

            //Receiving the corrupted version of the message
            for (int i = 0; i < message.length(); i++) {
                int bits[] = sender.toBinary(nums[i]);
                int corrupted[] = channel.transmit(bits);
                char decoded = receiver.toChar(corrupted);
                received += decoded;
            }

            System.out.println("The original message was: " + message);
            System.out.println("The received message is: " + received);

        }
    }
}
