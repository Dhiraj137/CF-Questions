

public class mergeSort{

    public static void merge(int[] arr, int start, int mid, int end){
        int[] temp = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;
        
        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= end){
            temp[k++] = arr[j++];
        }

        for(k = 0, i = start; k < temp.length; i++,k++){
            arr[i] = temp[k];
        }
    }
    public static void mergesort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }

        int mid = start + (end-start)/2;

        mergesort(arr,start,mid);   // dividing left part
        mergesort(arr,mid+1,end);   // dividing right part
        merge(arr,start,mid,end);   // merge left and right part
    }
    public static void main(String[] args) {
        int[] arr = {4,3,9,12,89,54,32,1,82};
        mergesort(arr, 0, arr.length-1);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}