package Ceng201HW_Assigments;

public class TestTreatmentQueue {
	public static void main(String [] args){
        TreatmentQueue queue = new TreatmentQueue();
        queue.enqueue(new TreatmentRequest(1235802320, 1500, true)); //priority
        queue.enqueue(new TreatmentRequest(1235802321, 1790, true)); //priority
        queue.enqueue(new TreatmentRequest(1235802323, 1400, false)); //normal
        queue.enqueue(new TreatmentRequest(1235802322, 1800, false)); //normal
        queue.enqueue(new TreatmentRequest(1235802319, 1560, false)); //normal
        queue.enqueue(new TreatmentRequest(1235802334, 1280, true)); //priority
        queue.enqueue(new TreatmentRequest(1235802395, 1370, true)); //priority
        queue.enqueue(new TreatmentRequest(1235802370, 1900, false)); //normal

        System.out.println("The queue is:"); //Print the first queue
        queue.printQueue();

        System.out.println("Dequeued queue is: " + queue.dequeue());
        System.out.println("Again dequeued queue is:" + queue.dequeue());
        System.out.println("Again dequeued queue is:" + queue.dequeue());

        System.out.println("The remaining queue size is: " + queue.size()); //Show the last queues size
        queue.printQueue();
    }
}
