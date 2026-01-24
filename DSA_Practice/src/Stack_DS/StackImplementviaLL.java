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
        if(head==null){
            System.out.println("Stack is UnderFlow");
            return -1;
        }
        return head.val;
    }
    int pop() throws Exception{
        if(head==null){
            throw new Exception("Stack UnderFlow Error");
        }
        int v = head.val;
        head = head.next;
        len--;
        return v;
    }
    void push(int ele){
        Node temp = new Node(ele);
        if(len==0) head = temp;
        else {
            temp.next = head;
            head = temp;
        }
        len++;
    }
    int size(){
        return len;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
}

public class StackImplementviaLL {
   public static void main(String args[]) throws Exception{
    MyStack st = new MyStack();
    st.push(52);st.push(26);st.push(66);st.display();st.pop();st.peek();st.push(89);
    st.display();
   }
}

