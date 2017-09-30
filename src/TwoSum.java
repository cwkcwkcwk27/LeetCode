import java.util.HashMap;



//0001
//170930


public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map =  new HashMap<Integer,Integer>();
        for(int i = 0;i < nums.length;i++)
        {
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i} ;
            }
            map.put(nums[i],i);
        }
        
        return null;
        
    }
}

/*
import java.util.Arrays;
import java.util.Scanner;

public class main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int index = scanner.nextInt();
         int[] array = new int[index];
         for(int i = 0;i<index;i++){
             array[i] = scanner.nextInt();
         }         
         int target = scanner.nextInt();
         TwoSum ts = new TwoSum();
         System.out.println(Arrays.toString(ts.twoSum(array,target)));
         
         scanner.close();
     }
         
}
*/


