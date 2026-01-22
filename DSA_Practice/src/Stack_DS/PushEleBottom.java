package Stack_DS;

import java.util.*;
public class PushEleBottom {
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
