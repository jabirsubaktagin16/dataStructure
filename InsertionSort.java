
import java.util.Random;

public class InsertionSort {
    public static int time;
    public static int comparison;
    public static int pass;
    void insertion(int array[]) {  
        int n = 20000;
        for (int j = 1; j < n; j++) {  
            int t = array[j];  
            int i = j-1;
            comparison++;
            while ((i > -1) && ( array [i] > t ) ) {  
                array [i+1] = array [i];
                pass++;
                i--;  
            }  
            array[i+1] = t; 
            pass+=2;
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = new int[20000];
        Random rand=new Random();
            
        InsertionSort is = new InsertionSort();
           
        for(int i=0 ; i<20000 ; i++)
            arr1[i] = rand.nextInt((75)+1);
        
        is.insertion(arr1);
        for(int i=0;i<20000;i++){    
            System.out.println(arr1[i]);
        }
        System.out.println("Sorting Time:" + time);
        System.out.println("Number of comparison:" + comparison);
        System.out.println("Number of Pass:" + pass);
    }    
}
