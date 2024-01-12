import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] myArray = {11,7,2,15};
        int targetValue = 9;

        //System.out.println(Arrays.toString(twoSum1(myArray, targetValue)));
        System.out.println(Arrays.toString(twoSum2(myArray, targetValue)));

    }

    public static int[] twoSum1(int [] input, int targetVal){
        for (int i = 0; i < input.length-1; i++){
            for (int j = i+1; j< input.length; j++){
                if(input[i] + input[j] == targetVal){
                    return new int[]{i,j};
                }

            }
        }
        return new int[]{};
    }

    public static int[] twoSum2(int [] input, int targetVal){
        Map<Integer, Integer> tempMap = new HashMap<>();

        for (int i = 0; i<input.length; i++){
            if(tempMap.containsKey(targetVal-input[i])){
                return new int[]{i, tempMap.get(targetVal-input[i])};
            }
            else{
                tempMap.put(input[i], i);
            }
        }
        return new int[]{};

    }
}
