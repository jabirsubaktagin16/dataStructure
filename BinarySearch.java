import java.util.Scanner;
 
public class BinarySearch 
{
  public static void main(String args[])
  {
    int start, end, middle, n, search, array[];
 
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of elements");
    n = in.nextInt(); 
    array = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
 
    for (int i = 0; i < n; i++)
      array[i] = in.nextInt();
 
    System.out.println("Enter value to find");
    search = in.nextInt();
 
    start  = 0;
    end   = n - 1;
    middle = (start + end)/2;
 
    while( start <= end )
    {
      if ( array[middle] < search )
        start = middle + 1;    
      else if ( array[middle] == search ) 
      {
        System.out.println(search + " found at location " + (middle + 1) + ".");
        break;
      }
      else
         end = middle - 1;
 
      middle = (start + end)/2;
   }
   if ( start > end )
      System.out.println(search + " is not present in the list.\n");
  }
}