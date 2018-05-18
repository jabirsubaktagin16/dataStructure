import java.util.*;
import java.io.*;
public class PostfixEvaluation {
    public static int[]stack= new int[100];
    public static int top=-1;
    public static Scanner sc=new Scanner(System.in);
    public static void push(int value){
        top++;
        stack[top]=value;
    }
    public static int pop(){
        int a;
        a=stack[top];
        top--;
        return a;
    }
    public static int is_operand(char ch){
        if(ch>='a' && ch<='z'||ch>='A' && ch<='Z')
            return 1;
        else 
            return 0;
    }
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        char [] postfix=new char[100];
        char ch;
        int i=0,op1,op2,result,m;
        System.out.print("Enter a Postfix Expression: ");
        postfix=sc.next().toCharArray();
        while(postfix[i]!='\0'){
            ch=postfix[i];
            if(is_operand(ch)==1){
                System.out.print("\nEnter the value of " +ch+":");
                m=sc.nextInt();
                push(m);
            }
            else{
                op2=pop();
                op1=pop();
                switch(ch){
                    case '+':
                        result=op1+op2;
                        push(result);
                        break;
                    case '-':
                        result=op1-op2;
                        push(result);
                        break;
                    case '*':
                        result=op1*op2;
                        push(result);
                        break;
                    case '/':
                        result=op1/op2;
                        push(result);
                        break;
                }
            }
            i++;
        }
        result=pop();
        System.out.print("The Result is: " +result);
    }
}
