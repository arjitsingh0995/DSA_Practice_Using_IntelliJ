package Stack_DS;

import java.util.Stack;

import static java.util.Collections.reverse;

public class ReverseStack {
        public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(40);
        st.push(54);
        st.push(19);
        int ele = 56;
        System.out.println(st);
        pushEle(st, ele);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    private static void reverse(Stack<Integer> st){
            if(st.size()<=1)return;
            int top = st.pop();
            reverse(st);
            pushEle(st,top);
    }
        private static void pushEle(Stack<Integer> st , int ele)
        {
            if(st.isEmpty()){
                st.push(ele);
                return;
            }
            int temp = st.pop();
            pushEle(st,ele);
            st.push(temp);
        }
}
