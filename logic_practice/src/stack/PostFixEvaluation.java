import java.util.Stack;

public class PostFixEvaluation {

    public static void main(String[] args) {
        String exp="231*+9-"; // abc*+d-
        System.out.println("==========="+get(exp));
    }

    public static void evaluate(char operator,Stack<Integer> stack)
    {
        int  a=  stack.pop();
        int b = stack.pop();
        switch (operator)
        {

            case '+':
                stack.push(b+a);
                break;
            case '-':
                stack.push(b-a);
                break;
            case '/':
                stack.push(b/a);
                break;
            case '*':
                stack.push(b*a);
                break;

        }

    }
    public static int get(String exp){
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            if(Character.isDigit(exp.charAt(i))){
                stack.push(exp.charAt(i)-'0');
            }else {
                evaluate(exp.charAt(i),stack);
            }
        }
        return stack.pop();
    }
}





