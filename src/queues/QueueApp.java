package queues;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class QueueApp {
    public static void main(String[] args){

        //create object from QueueX class
        QueueX mainQueue = new QueueX(5);
        Scanner sc = new Scanner(System.in);
        int inputStr;

        for (int i=1; i <= 5; i++){
            System.out.print("Enter Transaction ID " + i + ":"+ "");
            inputStr = sc.nextInt();
            mainQueue.insert(inputStr);
        }
        //Create Even Queue
        QueueX evenQueue = new QueueX(5);

        //Create Odd Queue
        QueueX oddQueue = new QueueX(5);

        int value;

        while (!mainQueue.isEmpty()) {

            value = mainQueue.remove();

            if (value % 2 == 0) {             //check even or odd
                evenQueue.insert(value);
            } else {
                oddQueue.insert(value);
            }
        }

        System.out.println("PC 1 ");
        while (!evenQueue.isEmpty()){
            System.out.println("Transaction " + evenQueue.remove());
        }
        System.out.println("PC 2 ");
        while (!oddQueue.isEmpty()){
            System.out.println("Transaction " + oddQueue.remove());
        }
    }
}
