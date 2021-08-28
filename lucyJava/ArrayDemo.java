import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayDemo {
    public final int a = 1;
    public static Map<Integer, Integer> mem = new HashMap<>();

    public static void main(String[] args) {
        List<Integer> coins = new ArrayList<>(Arrays.asList(1, 2, 5));
        long start = System.currentTimeMillis();
        int res = helper1(coins, 9000);
        long end = System.currentTimeMillis();
        System.out.println(end - start + " " + res);
        // start = System.currentTimeMillis();
        // res = helper2(coins, 30);
        // end = System.currentTimeMillis();
        // System.out.println(end - start + " " + res);

    }

    public static int helper1(List<Integer> coins, int n) {
        if (mem.containsKey(n)) {
            return mem.get(n);
        }
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }
        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subProblem = helper1(coins, n - coin);
            if (subProblem == -1) {
                continue;
            }
            res = Math.min(res, 1 + subProblem);
        }

        mem.put(n, res == Integer.MAX_VALUE ? -1 : res);
        return mem.get(n);
    }
}