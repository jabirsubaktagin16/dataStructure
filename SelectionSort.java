import java.util.Random;
public class SelectionSort {
    public static long time;
    public static int comparison;
    public static int pass;
    
    void selection(int arr[]){
        long startTime = System.currentTimeMillis();
        int n=20000,k,t=0,temp;
        for(int j=n-1; j>=1; j--){
            t=0;
            for(k=1; k<=j; k++){
            comparison++;
            if(arr[t]<arr[k])
                t=k;
            }
            temp = arr[t];
            arr[t] = arr[j];
            arr[j] = temp;
            pass+= 3;
        }
        long endTime = System.currentTimeMillis();
        time = endTime - startTime;
    }
    public static void main(String arg[]){
        
        SelectionSort ss = new SelectionSort();
        Random rand=new Random();
        
        
        int arr[] = new int[20000];
        
        for(int i=0 ; i<20000 ; i++)
            arr[i] = rand.nextInt((75)+1);
         ss.selection(arr);
        for(int i=0;i<20000;i++){
           
            //System.out.println(arr[i]);
        }
        
        System.out.println("Sorting Time:" + time);
        System.out.println("Number of comparison:" + comparison);
        System.out.println("Number of Movement:" + pass);
    }
}
