import java.util.Scanner;
public class TowerOfHanoiRecursive {
   public static int movement;
   public static Scanner sc =new Scanner(System.in);
   public static void Hanoi(int n,int i, int j, int k)
    {
        if(n==1)
        {
            System.out.println("The top disk moved from " +i+ " to " +k);
            movement++;
        }
        else{
            Hanoi(n-1,i,k,j);
            System.out.println("The top disk moved from " +i+ " to " +k);
            movement++;
            Hanoi(n-1,j,i,k);
        }
    }

    public static void main(String[] args) {    
    int n;
    System.out.print("Enter the number of disks: ");
    n=sc.nextInt();
    Hanoi(n,1,2,3);
    System.out.println("Total Moves: " +movement);
    }
}
