package Ceng201HW_Assigments;

public class DischargeStack {
	private static class Node{
        DischargeRecord data;
        Node next;
        Node (DischargeRecord data){
            this.data = data;
        }
    }
    private Node top;
    public void push(DischargeRecord record){
        Node newNode = new Node(record);
        newNode.next = top;
        top = newNode;
    }
    public DischargeRecord pop(){
        if(top == null){
            return null;
        }
        DischargeRecord record = top.data;
        top = top.next;
        return record;
    }
    public DischargeRecord peek(){ //It shows the top elements data without delete it
        if(top == null){
            return null;
        }
        return top.data;
    }
    public void printStack(){
        Node current = top;
        if(top == null){
            System.out.println("The stack is empty");
        }
        while(current!= null){
            System.out.println(current.data);
            current = current.next;
        }
    }
	

}
