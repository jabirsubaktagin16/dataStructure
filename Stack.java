import java.util.Scanner;
public class Stack {
    public static int i = 0;
    public static int arr[] = new int[10];

    public static void push() {
        if (i < 10) {
            System.out.println("Enter a number:");
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
            i++;
        } else {
            System.out.println("Stack overflow");
        }
    }

    public static void pop() {
        if (i > 0) {
            i--;
            System.out.println("Popped :" + arr[i]);
        } else {
            System.out.println("Your Stack is empty");
        }
    }
    public static void display(){
        System.out.println("Display:");
                    for (int j = 0; j < i; j++) {
                        System.out.print( arr[j]+ "\t");
                    }   System.out.print("\n");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("STACK MENU:\n1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT");
            System.out.println("Choose an Option:");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                default:
                    break;
            }
        } while (n == 1 || n == 2 || n == 3);

    }
}
