import java.util.LinkedList;
public class LL_Q1 {


    
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        
        for(int i=1 ; i<=8; i++){
            ll.add(i);
        }
        
       int M=2;
       int N=2;

       int i = M;
       while(i < ll.size()){

        int count = 0;

        while(count < N && i < ll.size()){
            ll.remove(i);
            count++;
        }

        i += M;
       }

       System.out.println(ll);
    }
}
