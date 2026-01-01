public class Hash {
    private int size;
    private Node[] dataMap;

    Hash(int size) {
        this.size = size;
        dataMap = new Node[size];
    }

    public int hashFunction(String key) {
        int hash = 0;
        char[] array = key.toCharArray();
        for(int i = 0 ; i < array.length ; i++) {
            int asciiValue = array[i];
            hash = (hash + asciiValue * 8) % size;
        }
        return hash;
    }

    public void set(String key,int value) {
        int index = hashFunction(key);
        Node newNode = new Node(key,value);
        Node current = dataMap[index];
        if(dataMap[index] == null) {
            dataMap[index]= newNode;
            return;
        }
        while (true) {
            if(current.key.equals(key)) {
                current.value += value;
                return;
            }
            if(current.next == null) {
                //seperate chaining : iki farklı key için aynı indexi verdiği durumda Node'ları chain durumunda yazmak.
                current.next = newNode;
                return;
            }
            current = current.next;
        }


    }

    public void setWithOpenAdressing(String key,int value) {
        int index = hashFunction(key);
        Node newNode = new Node(key,value);
        if(dataMap[index] == null) {
            dataMap[index] = newNode;
            return;
        }else{
            for(int count = 0;count < size -1;count++) {
                if(dataMap[++index] == null){
                    dataMap[index] = newNode;
                    return;
                }
            }
            System.out.println("Overflow");
        }
    }

    public boolean search(String key) {
        int hash = hashFunction(key);
        Node current = dataMap[hash];
        while(current != null) {
            if (current.key.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void remove(String key){
        int hash = hashFunction(key);
        Node prev = null;
        Node current = dataMap[hash];
        if (dataMap[hash] == null) {
            return;
        }
        if(dataMap[hash].key.equals(key)) {
            dataMap[hash] = dataMap[hash].next;
            return;
        }
        while(current != null) {
            if (current.key.equals(key)) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void printHash() {
        for(int i = 0 ; i < size ; i++) {
            Node current = dataMap[i];
            System.out.println("For Index " + i );
            while(current != null) {
                System.out.println(current.key  + ": " + current.value);
                current = current.next;
            }
        }
    }
}
class Node {
    String key;
    int value;
    Node next;

    Node(String key,int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
