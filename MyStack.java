public class MyStack {
    class Node{
        int data;
        Node head, next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node top;
    private int length;
    public MyStack(){
        head = null;
        length = 0;
    }
    public int getLength(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        length++;
    }
    // pop(): remove top element and return data of removed element
    public Integer pop(){
        if(isEmpty()){
            //throw new RuntimeException("Stack is empty");
            return null;
        }
        int result = head.data;
        head = head.next;
        length = getLength() - 1;
        System.out.println("Removed: " + result);
    }

}