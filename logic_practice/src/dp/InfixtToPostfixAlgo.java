import java.util.Stack;

public class InfixtToPostfixAlgo {

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("==========="+get(exp));
    }

    public static int getPre(char operator)
    {
        switch (operator)
        {
            case '+':
            case '-':
                return 1;
            case '/':
            case '*':
                return 2;
            case '^' :return 3;
            default:
                return -1;
        }

    }
    public static String get(String infix){
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix= new StringBuilder();
        for(int i=0;i<infix.length();i++){

            if(Character.isLetterOrDigit(infix.charAt(i))){
                postfix.append(infix.charAt(i));
            }else if(infix.charAt(i) == '('){
                stack.push(infix.charAt(i));
            }
            else if(infix.charAt(i) == ')'){
                while (!stack.empty() && stack.peek()!='('){
                    postfix.append(stack.pop());
                }
                stack.pop();

            }else {
                int currentOp = getPre(infix.charAt(i));
                    while (!stack.empty() && getPre(stack.peek())>=currentOp)
                    {
                        postfix.append(stack.pop());
                    }
                    stack.push(infix.charAt(i));
            }
        }
        while(!stack.empty())
        {
            postfix.append(stack.pop());
        }

    return postfix.toString();
    }
}


