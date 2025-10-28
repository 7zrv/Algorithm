import java.util.*;

class Solution {
    public int solution(int n, int[][] q, int[] ans) {
        
        List<int[]> combinations = new ArrayList<>();
        
        generateCombinations(n, 5, 1, new int[5], 0, combinations);
        
        int count = 0;

        for (int[] comb : combinations) {
            if (isValid(comb, q, ans)) count++;
        }

        return count;
    }

    private boolean isValid(int[] comb, int[][] q, int[] ans) {
        
        Set<Integer> secret = new HashSet<>();
        
        for (int num : comb) secret.add(num);

        for (int i = 0; i < q.length; i++) {
            int match = 0;
            for (int num : q[i]) {
                if (secret.contains(num)) match++;
            }
            if (match != ans[i]) return false;
        }
        return true;
    }

    private void generateCombinations(int n, int r, int start, int[] temp, int depth, List<int[]> list) {
        if (depth == r) {
            list.add(temp.clone());
            return;
        }
        for (int i = start; i <= n; i++) {
            temp[depth] = i;
            generateCombinations(n, r, i + 1, temp, depth + 1, list);
        }
    }
}
