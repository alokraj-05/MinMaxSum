import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long minimumSum=0;
    long maximumSum=0;
    List<Long> result = new ArrayList<>();
    for(Integer integerValue:arr){
        result.add(Long.valueOf(integerValue));
    Collections.sort(result);
    }
    for(int i=0;i<result.size()-1;i++){
        minimumSum+=result.get(i);
    }
    for(int i=1;i<result.size();i++){
        maximumSum+=result.get(i);
    }
    System.out.print(minimumSum+" "+maximumSum);
    
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
