
import java.util.Scanner;

public class Queue {
    static int i = 0;
    static int arr[] = new int[10];

    public static void push() {
        if (i < 10) {
            System.out.println("Enter a number:");
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
            i++;
        } else {
            System.out.println("Queue overflow");
        }
    }

    public static void pop() {
        if (i > 0) {
            System.out.println("Popped :" + arr[0]);
            for (int j = 1; j < 10; j++) {
                arr[j - 1] = arr[j];
            }

            i = i - 1;
        } else {
            System.out.println("Your queue is empty");
        }
    }
    public static void display(){
         System.out.println("Display:");
                    for (int j = 0; j < i; j++) {
                        System.out.print(arr[j]+ "\t");
                    }   System.out.print("\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("QUEUE MENU:\n1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT");
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
