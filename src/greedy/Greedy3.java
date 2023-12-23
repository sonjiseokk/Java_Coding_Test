package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());

        int cnt = 0;
        while (n >= k) {
            if (n % k == 0) {
                n /= k;
                cnt += 1;
                continue;
            }
            n -= 1;
            cnt += 1;
        }
        while (n != 1) {
            n -= 1;
            cnt += 1;
        }
        System.out.println(cnt);
    }
}
