public class SelectionSort {

    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min_index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_index]>arr[j]){
                    min_index = j;
                }

            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

        }
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        int arr[] = {64,25,12,22,11};
        sort(arr);
    }
}
