package Ceng201HW_Assigments;

public class PatientList {
	 Node head;
	    private class Node {
	        Patient data;
	        Node next;

	        public Node(Patient data) {
	            this.data = data;
	        }
	    }

	    public void addPatient(Patient p) {   //Add a  new patient to the list
	        Node newNode = new Node(p);
	        if (head == null) {
	            head = newNode;
	        }
	        Node current = head;
	        while (current.next != null) {
	            current = current.next;
	            current.next = newNode;
	        }
	    }

	    public void removePatient(int id) {
	        if (head == null) {
	            System.out.println("The  hospital system is empty ");
	            return;
	        }
	        if (head.data.Id == id) {
	            head = head.next;
	        }
	        Node current = head;
	        while (current.next != null && current.next.data.Id != id) {
	            current = current.next;
	        }
	        if (current.next != null) {
	            current.next = current.next.next;
	        }
	    }
	    public Patient findPatient(int id) {
	        Node current = head;
	        while (current != null) {
	            if (current.data.Id == id) {
	                System.out.println("Finding patients id is >-- " + current.data);
	                return current.data;
	            }
	            current = current.next;
	        }
	        return null;
	    }


	    public  void printList() {
	        Node current = head;
	        while (current!= null) {
	            System.out.println(current.data);
	            current = current.next;
	        }
	    }
}
