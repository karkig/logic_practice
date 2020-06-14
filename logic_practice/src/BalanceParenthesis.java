import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalanceParenthesis {

    public static void main(String[] args) throws IOException {

        String exp = "(]]{]{}";
        System.out.println("has string balance ? :  " + isBalance(exp));
    }

    public static int getRank(char ch) {
        switch (ch) {
            case '(':
            case ')':
                return 1;
            case '[':
            case ']':
                return 2;
            case '{':
            case '}':
                return 3;
            default:
                return 0;
        }
    }

    public static boolean isBalance(String exp) {
        Stack<Character> stack = new Stack<>();
        boolean isBaln = false;
        for (int i = 0; i < exp.length(); i++) {
            char currentChar = exp.charAt(i);
            if (currentChar == '[' || currentChar == '{' || currentChar == '(') {
                stack.push(currentChar);
            } else  {
                if(stack.empty()){
                    isBaln = false;

                }else {
                    isBaln = (getRank(stack.pop()) == getRank(currentChar));
                    if(!isBaln){
                        break;
                    }

                }
            }
        }
        return stack.isEmpty() && isBaln;
    }
}





