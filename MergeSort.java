import java.util.Random;
import java.util.concurrent.TimeUnit;
public class MergeSort {
    public static long time;
    public static int pass; 
    public static int comparison;

    void Merge(int arr[] , int p , int q , int r)
{
    long startTime = System.nanoTime();
    int n1 = q-p+1;
    int n2 = r-q;
    int L[]=new int[n1+1];  
    int R[]=new int [n2+1];
    for(int i = 0 ; i < n1 ; i++)
    {
        L[i] = arr[p+i];
    }
    for(int j = 0 ; j < n2 ; j++)
    {
        R[j] = arr[q+1+j];
    }
    L[n1] = Integer.MAX_VALUE;
    R[n2] = Integer.MAX_VALUE;
    for(int i = 0 , j = 0 , k = p ; k <= r ; k++)
    {
        if(L[i] <= R[j])
        {
            comparison++;
            arr[k] = L[i];
            i++;
            pass++;
        }
        else
        {
            comparison++;
            arr[k] = R[j];
            j++;
            pass++;
        }
    }
    long endTime = System.nanoTime();
    time= endTime - startTime;
}

void MergeSort(int arr[] , int p , int r)
{
    if(p<r)
    {
        int q = ((p+r)/2);
        MergeSort(arr , p , q);
        MergeSort(arr , q+1 , r);
        Merge(arr, p , q , r);
    }
}

public static void main(String[] args) {
        int[] arr1 = new int[20000];
    int n=20000;
        Random rand=new Random();
            
        MergeSort ms = new MergeSort();
           
        for(int i=0 ; i<20000 ; i++)
            arr1[i] = rand.nextInt((20000)+1);
        
        ms.MergeSort(arr1,0,19999);
        for(int i=0;i<20000;i++){  
            
            System.out.println(arr1[i]);
        }
        System.out.println("Sorting Time: " +time);
        System.out.println("Comparison: " +comparison);
        System.out.println("Movement: " +pass);
    }    

}
