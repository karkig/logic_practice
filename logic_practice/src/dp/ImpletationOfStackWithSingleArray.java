import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ImpletationOfStackWithSingleArray {

    static int stack[]= new int[6];
    static int top1=-1;
    static int top2=stack.length;
    public static void push1() throws Exception {
        if(top1+1 >= top2){
            System.out.println("stack 1 is over flow");
        }else {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the value ");
            int element = Integer.parseInt(br.readLine());
            stack[++top1] = element;

        }
    }

    public static void push2() throws Exception {
        if(top2-1 <= top1){
            System.out.println("stack 2 is over flow");
        }else {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the value ");
            int element = Integer.parseInt(br.readLine());
            stack[--top2] = element;

        }
    }
    public static void pop1() {
        if(top1<=-1){
            System.out.println("stack 1 is empty ");
        }else {
            System.out.println(" the value is "+stack[top1--]);
        }
    }
    public static void pop2() {
        if(top2>=stack.length){
            System.out.println("stack 2 is empty ");

        }else {
            System.out.println(" the value is "+stack[top2++]);
        }
    }

    public static void main(String[] args) throws Exception {
        boolean hasTrue = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (hasTrue) {
            System.out.println(" \n\n\n\nEnter your choice \n 1.Push1 \n 2.push2 \n 3. pop1. \n 4. pop2 \n 0. exit");
            switch (br.readLine()) {
                case "1":
                    push1();
                    break;
                case "2":
                   push2();
                    break;
                case "3":
                   pop1();
                    break;
                case "4":
                    pop2();
                    break;
                case "0":

                    hasTrue=false;
                    break;
                default:
                    System.out.println("Enter the correct choice.");

            }
        }
    }

}
//  10  20 30      60