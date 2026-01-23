package Stack_DS;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class MyStack{
    Node head;
    int len;
    int peek(){
        return head.val;
    }
    int pop(){
        int v = head.val;
        head = head.next;
        return v;
    }
    void push(int ele){
        Node temp = new Node(ele);
        if(len==0) head = temp;
        else {
            temp.next = head;
            head = temp;
        }
    }
    int size(){
        return len;
    }
}

public class StackImplementviaLL {
   public static void main(String args[]){
    MyStack st = new MyStack();
   }
}

