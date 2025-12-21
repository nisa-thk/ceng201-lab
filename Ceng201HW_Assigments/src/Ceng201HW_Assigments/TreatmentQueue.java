package Ceng201HW_Assigments;

public class TreatmentQueue {
	 private class Node {
	        TreatmentRequest data;
	        Node next;

	        Node(TreatmentRequest data) {
	            this.data = data;
	        }
	    }

	    private Node frontNormal, rearNormal;
	    private Node frontPriority, rearPriority;
	// Adding queue but first add the priority one
	    public void enqueue(TreatmentRequest request) {
	        Node newNode = new Node(request);
	        if (request.priority) {
	            if (frontPriority == null) {
	                frontPriority = rearPriority = newNode;
	            } else {
	                rearPriority.next = newNode;
	                rearPriority = newNode;
	            }
	        } else {
	            if (frontNormal == null) {
	                frontNormal = rearNormal = newNode;
	            } else {
	                rearNormal.next = newNode;
	                rearNormal = newNode;
	            }
	        }
	    }
	    //Remove the queue but removing the priority one first
	    public TreatmentRequest dequeue(){
	        if(frontPriority != null){
	            TreatmentRequest request = frontPriority.data;
	            frontPriority = frontPriority.next;
	            if(frontPriority == null){
	                rearPriority= null;
	            }
	            return request;
	        }else if(frontNormal != null){
	            TreatmentRequest request = frontNormal.data;
	            frontNormal = frontNormal.next;
	            if(frontNormal == null){
	                rearNormal = null;
	            }
	            return request;
	        }
	        return null; // If queue is full empty
	    }
	    public int size(){
	        int count = 0;
	        Node current = frontPriority;
	        while(current != null){
	            current = current.next;
	            count ++;
	        }
	        current = frontNormal;
	        while (current!= null){
	            current = current.next;
	            count++;
	        }
	        return count;
	    }
	    public void printQueue(){
	        System.out.println("The Priority Queue is:");
	        Node current = frontPriority;
	        while(current != null){
	            System.out.println(current.data);
	            current = current.next;
	        }
	        System.out.println("The Normal Queue: ");
	        current = frontNormal;
	        while(current != null){
	            System.out.println(current.data);
	            current = current.next;
	        }
	    }
}
