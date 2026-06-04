import java.util.ArrayList;

public class AL_PairSum {

    public static boolean pairsum(ArrayList<Integer> List, int target){
        int left = 0;
        int right = List.size()-1;
        while(left < right){
            if(List.get(left) + List.get(right) == target){
                return true;
            }else if(List.get(left) + List.get(right) < target){
                left++;
            }else if(List.get(left) + List.get(right) > target){
                right--;
            }
        }

        return false;
    }

    public static boolean pairsum2 (ArrayList<Integer> List, int target){

        //Find pivot
        int bp = -1;
    
        for(int i= 0; i< List.size(); i++){
            if(List.get(i) > List.get(i+1)){
                bp = i;
                break;
            }
        }

        int left = bp+1;
        int right = bp;


        while(left != right){
            if(List.get(left) + List.get(right) == target){
                return true;
            }else if(List.get(left) + List.get(right) < target){
                left = (left+1)%List.size();
            }else if(List.get(left) + List.get(right) > target){
                right = (List.size()+right-1)%List.size();
            }
        }

        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> List = new ArrayList<>();
        
        List.add(11);
        List.add(15);
        List.add(6);
        List.add(8);
        List.add(9);
        List.add(10);

        System.out.println(pairsum2(List, 26));
    }
}
