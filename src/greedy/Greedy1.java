package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Greedy1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());

        Integer[] nums = Arrays.stream(bufferedReader.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
        Arrays.sort(nums, Collections.reverseOrder());

        int first = nums[0];
        int second = nums[1];

        Integer res = 0;
        for (int i = 1; i <= m; i++) {
            if (i % k == 0){
                res += second;
            }
            else{
                res += first;
            }
        }

        System.out.println(res);
    }
}