public class Implementation {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    static class linkedlist{
        Node head = null;
        Node tail = null;
        
        void insertAtEnd(int data){
            Node temp = new Node(data);

            if(head == null){
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
        }

        void insertAtStart(int data){
            Node temp = new Node(data);

            if(head == null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
        }

        void insert(int data, int index){
            Node newNode = new Node(data);
            Node temp = head;
            if(index == 0) insertAtStart(data);
            // if(index == size()) insertAtEnd(data);
            for(int i=0;i<index-1;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        int getElement(int index){
            Node temp = head;
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
            return temp.val;
        }

    }
    public static void main(String[] args){
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
    }
}
