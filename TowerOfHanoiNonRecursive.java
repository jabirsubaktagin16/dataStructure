import java.util.Scanner;
import java.util.*;
public class TowerOfHanoiNonRecursive {
    public static int movement;
    public static Scanner sc =new Scanner(System.in);
    public static Stack<Integer>s=new Stack<Integer>();
    public static void Hanoi(int n,int i,int j,int k){
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(n);
        
        
        while(!s.empty()){
            n=s.pop();
            i=s.pop();
            j=s.pop();
            k=s.pop();
            
            if(n==1){
                System.out.println("The top disk moved from " +i+ " to " +k);
                movement++;
            }
            else{
                s.push(k);
                s.push(i);
                s.push(j);
                s.push(n-1);

                s.push(k);
                s.push(j);
                s.push(i);
                s.push(1);

                s.push(j);
                s.push(k);
                s.push(i);
                s.push(n-1);
                
            }
        }
    }
    public static void main(String[] args){
        int n;
        System.out.print("Enter the number of disks: ");
        n=sc.nextInt();
        Hanoi(n,1,2,3);
        System.out.println("Total Moves: " +movement);
    }
}
