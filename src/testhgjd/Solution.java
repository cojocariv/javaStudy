package testhgjd;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Solution {
    String s1;

    static class Solution2 {
        String s2;
    }

    class Solution3 {
         private String s3;

        public String getS3() {
            return s3;
        }
    }

    public void main(String[] args) {
        Solution solution = new Solution();
    Solution.Solution3 solution3 = solution.new Solution3();
solution3.getS3();

    }
}
