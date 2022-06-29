import java.util.HashMap;

public class CountSubArrayWith0Sum {

    public static long countSubArraysWith0Sum(long arr[], int n ){

        HashMap<Long, Integer> map = new HashMap<>();
        long count = 0, sum= 0;

        for(int i = 0; i<n; i++){
            sum +=0;
            if(sum ==0){
                count ++;
            }
            if(map.containsKey(sum)){
                count++;
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }return count;

    }
    public static void main(String[] args) {

    }
}
