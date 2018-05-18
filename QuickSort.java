import java.util.Random;
import java.util.concurrent.TimeUnit;
public class QuickSort {
    public static long time;
    public static int comparison;
    public static int pass;
void quick_sort(int arr[], int f, int l)
{
    long starttime=System.nanoTime();
    if(f>=l)
        return;
    int i, j;
    i=f+1;
    while(arr[i]<arr[f]){
        i++;
        if (i>19999)break;
        comparison++;
    }
    j=l;
    while(arr[j]>arr[f]){
        j--;
        comparison++;
    }
    while(i<j)
    {
        arr[i]=arr[j];
        pass++;
        do
        {
            i++;
            if (i>19999)break;
            comparison++;
        } while(arr[i]<arr[f]);
        do
        {
            j--;
            comparison++;
        } while(arr[j]>arr[f]);
    }
    arr[f]=arr[j];
    swap(arr[f],arr[l]);
    pass++;
    quick_sort(arr, f, j-1);
    quick_sort(arr, j+1, l);
    long endtime=System.nanoTime();
    time=endtime-starttime;
}
    private void swap(int a, int b) {
            int temp = a;
            a = b;
            b = temp;
    }

    public static void main(String[] args) 
    {
    int[] arr1 = new int[20000];
    int n=20000;
        Random rand=new Random();
            
        QuickSort qs = new QuickSort();
           
        for(int i=0 ; i<20000 ; i++)
            arr1[i] = rand.nextInt((20000)+1);
        
        
        for(int i=0;i<20000;i++){  
            qs.quick_sort(arr1,0,n-1);
            System.out.println(arr1[i]);
        }
        System.out.println("Sorting Time: " +time);
        System.out.println("Comparison: " +comparison);
        System.out.println("Movement: " +pass);
    }    
 }