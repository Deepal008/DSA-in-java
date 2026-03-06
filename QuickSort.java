public class QuickSort {
    public static void main(String[] args) {
        
        int arr[] = {-7,4,8,3,0,9};

        int n = arr.length;

        quickSort(arr, 0, n-1);
        printArr(arr);

    }

    public static void printArr(int arr[]){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static int partition(int arr[], int low, int high){

        int pivot = arr[low];
        int i = low+1;
        int j = high;
        int temp;

        while(i <= j){

            while(i <= j && arr[i] <= pivot)
                i++;

            while(j >= low && arr[j] > pivot)
                j--;
            
            if(i <j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }


    public static void quickSort(int arr[], int low, int high){

        int p;

        if(low < high){
            p = partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }

    }
}
