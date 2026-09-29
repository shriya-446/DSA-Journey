import java.util.*;

class Solution {
    public List<Integer> pascalTriangleII(int r) {

        List<Integer> ans = new ArrayList<>();

        int value = 1;

        for (int i = 0; i < r; i++) {
            ans.add(value);

            value = value * (r - i - 1) / (i + 1);
        }

        return ans;
    }
}
