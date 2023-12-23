package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Greedy2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int col = Integer.parseInt(tokenizer.nextToken());
        int row = Integer.parseInt(tokenizer.nextToken());

        List<Integer> res = new ArrayList<>();
        int[][] nums = new int[col][row];
        for (int i = 0; i < col; i++) {
            tokenizer = new StringTokenizer(br.readLine());
            int small = 10001;
            for (int j = 0; j < row; j++) {
                nums[i][j] = Integer.parseInt(tokenizer.nextToken());
                small = Math.min(small, nums[i][j]);
            }
            res.add(small);
        }

        System.out.println(Collections.max(res));



    }
}
