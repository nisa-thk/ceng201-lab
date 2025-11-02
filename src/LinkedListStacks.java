public class LinkedListStacks<T> {
        private Node top;
        private int size;
        public  LinkedListStacks(){
            this.top = null;
            this.size = 0;
        }
        private class Node {
            T data;
            Node next;
            public Node(T data) {
               this.data = data;
               this.next = null;
            }
        }
       public void  push(T item){
           Node newNode = new Node(item);
           newNode.next = top;
           top = newNode;
           size++;
       }
       public void insertMiddle(T item){
           if(top == null){
               push(item);
               return;
           }
           int mid = size / 2;
           Node current = top;
           Node prev = null;

           for(int i =0; i<mid; i++){
               prev = current;
               current = current.next;
           }
           Node newNode = new Node (item);
           newNode.next = current;
           if(prev != null){
               prev.next = newNode;
           } else{
               top = newNode;
           }
           size ++;
    }
       public void printStacks(){
           Node current = top;
           while(current!= null){
               System.out.print(current.data + ">--");
               current = current.next;
           }
       }
   }
