package stack;

import java.util.Stack;

public class infixtopost {
    public static void main(String[] args) {
        Stack<Integer> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        String st="(10+2)*6-(4^2)+20";
        int n=st.length();

        for(int i=0; i<n; i++){
            char c=st.charAt(i);
            int aschii=(int)c;

            if(aschii>=48 && aschii<=57){
                val.push(aschii-48);
            }

            else if(op.size()==0 || op.peek()=='(' || c=='('){
                op.push(c);
            }

            else if(c==')'){
                while(op.peek()!='('){
                    int v2 = val.pop();
                    int v1 = val.pop();

                    if (op.peek() == '-') val.push(v1 - v2);
                    if (op.peek() == '+') val.push(v1 + v2);
                    if (op.peek() == '*') val.push(v1 * v2);
                    if (op.peek() == '/') val.push(v1 / v2);

                    op.pop();
                }
                op.pop();
            }

            else{
                if(c=='+' || c=='-'){
                    int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);

                    op.pop();
                    op.push(c);
                }
                if(c=='*' || c=='/'){

                    if (op.peek() == '*' || op.peek() == '/') {

                        int v2 = val.pop();
                        int v1 = val.pop();

                        if (op.peek() == '*') val.push(v1 * v2);
                        if (op.peek() == '/') val.push(v1 / v2);

                        op.pop();
                        op.push(c);
                    } 
                    else{
                        op.push(c);
                    }
             }
        }
    }
    while(val.size()>1){
        int v2 = val.pop();
            int v1 = val.pop();

            if (op.peek() == '-') val.push(v1 - v2);
            if (op.peek() == '+') val.push(v1 + v2);
            if (op.peek() == '*') val.push(v1 * v2);
            if (op.peek() == '/') val.push(v1 / v2);

            op.pop();
    }
    System.out.println(val.peek());
}
}

