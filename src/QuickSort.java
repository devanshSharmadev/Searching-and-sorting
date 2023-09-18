public class QuickSort {
    public static void sort(int arr[],int low,int high){
        if(high>low){
            int pivot=getPivot(arr,low,high);
            sort(arr,low,pivot-1);
            sort(arr,pivot+1,high);
        }
    }

    public static int getPivot(int arr[],int low,int high){
        int pivot = arr[high];
        int i=low;
        for(int j=low;j<=high;j++){
            if(arr[j]<pivot){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i] = temp;
                i++;
            }
        }
        int temp=arr[high];
        arr[high]=arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args){
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        sort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
