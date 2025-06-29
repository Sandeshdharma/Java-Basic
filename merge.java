import java.util.Scanner;

public class merge {
    public static void main(String[] args) 
    {
       
        int arr1[]= {1, 2, 3, 4,5,7};
        int arr2[] = {8,11,12,45,78};
        int arr3[] = {};
            
        }
        System.out.println(merge(arr1[] , arr2[]));

        
    }
    public static void merge(int[] arr1 , int[] arr2)
    {
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<m && j< n)
        {
            if(arr[i] < arr2[j])
            {
                i++;
                k++;

            }else
            {
                ans[k+1] = arr2[j++];
                j++;
                k++;

            }
        }
        while(j<n){
            ans[k] = arr2[j];
            j++;
            k++;

        }
        while(i<m){
            ans[k] = arr1[j];
            i++;
            j++;

    }
    System.out.println();
}
