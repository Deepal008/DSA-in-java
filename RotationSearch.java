public class RotationSearch {
    public static void main(String[] args) {
        
        int arr[] = {4,5,1,2,3};

        System.out.println(Searching(arr, 2));
    }


    public static int Searching(int arr[], int target){
        int si = 0;
        int ei = arr.length-1;
        
        while(si <= ei){
            int mid = (si + ei)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[si] <= arr[mid]){   //left part of the array
                  
                if(target >= arr[si] && target <= arr[mid]){
                    ei = mid-1;
                }else{
                    si = mid+1;
                }
            
            }else{       // Right part of the array

                if(target > arr[mid] && target <= ei){
                    si = mid+1;
                }else{
                    ei = mid-1;
                }
            }
        }

        return -1;
    }

}
