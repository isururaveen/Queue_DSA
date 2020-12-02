package queues;

public class QueueX {
    private int queueArr[];
    private int maxSize;
    private int rear;
    private int front;
    private int noItems;

    public QueueX(int s){
        maxSize = s;        //whnever user is create object from the queueX class, user will pass the value.t
                            //that value will be array size
        queueArr= new int[maxSize];
        front = 0;          //is the variable keep track on very first value
        rear = -1;          //  keep track on last value, we are removeing from front and adding to the rear
        noItems = 0;        //no of elements which is inside the array
    }

    public void insert(int j){

        //check whether queue is full or not
        if (rear == maxSize -1){
            System.out.println("Queue is full!");
        }
        else {                      //if the queue is not full
            queueArr[++rear] = j; //Access the queue array rear location and
                                    //increment it by 1 and (that incremented location)
                                    //assigned the j value
            noItems++;
        }
    }

    public int remove(){

        //check whether queue is empty
        if (noItems == 0){
            System.out.println("Queue is Empty!");
            return -99;             //invalid integer
        }
        else{       //if not empty
            noItems--;                          //deduct noItems
            return queueArr[front++];           //
        }
    }

    public boolean isEmpty(){
        return (noItems == 0);
    }

    public boolean isFull(){
        return (noItems == maxSize);
    }
}
