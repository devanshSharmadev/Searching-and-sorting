import java.util.ArrayList;

// Coded by Devansh Sharma
public class BinarySearch {
    // Binary Search by Iterative MEthod
    public static Integer binarySearchiterative(int arr[],int x){
        int l=0;
        int r= arr.length-1 ;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]==x)
                return m;
            else if(arr[m]<x){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return -1;
    }

    // Binary Search by Recursive Method
    public static Integer binarySearcRecusrive(int arr[],int x,int l,int r){
        if(r>=l){
            int m= (l+r)/2;
            if(arr[m]==x)
                return m;
            else if(arr[m]>x)
                return binarySearcRecusrive(arr,x,l,m-1);
            return binarySearcRecusrive(arr,x,m+1,r);
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,4,5,8,9,10};
        int result= binarySearchiterative(arr,9);
        System.out.println("FROM ITERATIVE ----> "+result);
        int result2 = binarySearcRecusrive(arr,4,0,arr.length-1);
        System.out.println("FROM ITERATIVE ----> "+result2);
        int caseIfElement = binarySearchiterative(arr,11);
        System.out.println(caseIfElement);
    }
}
