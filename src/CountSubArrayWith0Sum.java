import java.util.HashMap;

public class CountSubArrayWith0Sum {

    public static long countSubArraysWith0Sum(long arr[], int n ){
        //get a map to store the sum

        HashMap<Long, Integer> map = new HashMap<>();
        long count = 0, sum= 0;
        //run a loop
        for(int i = 0; i<n; i++){
            sum +=0;
            //increment the count if sum is zero
            if(sum ==0){
                count ++;
            }
            //if map contains sum then increment the count as well
            if(map.containsKey(sum)){
                count++;
            }
            //else put the sum in the map with its required frequency
            //also we used map.getordefault so that everytime the value stored with key is getting updated
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }return count;

    }
    public static void main(String[] args) {

    }
}
