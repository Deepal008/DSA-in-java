import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Greedy_indianCoin {
    public static void main(String[] args){
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount = 1059;
        ArrayList<Integer>  ans = new ArrayList<>();
        for(int i=0; i<coins.length; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    countOfCoins++;
                    amount -= coins[i];
                    ans.add(coins[i]);
                }
            }
        }

        System.out.println("total min coins used "+countOfCoins);
        System.out.println(ans);
    }
}
