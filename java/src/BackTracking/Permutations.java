package BackTracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length < 1) return new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int n : nums){
            set = union(set, n);
        }
        for(List<Integer> s : set){
            ans.add(s);
        }
        return ans;
    }

    public Set<List<Integer>> union(Set<List<Integer>> box, int n){
        Set<List<Integer>> ans = new HashSet<>();
        if(box.size() < 1){
            List<Integer> inner = new ArrayList<>();
            inner.add(n);
            ans.add(inner);
            return ans;
        }
        for(List<Integer> b : box){
            for(int i = 0; i <= b.size(); i++){
                List<Integer> newB = new ArrayList<>(b);
                newB.add(i, n);
                ans.add(newB);
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Permutations permutations = new Permutations();
        int[] myInput = {1, 2, 3};
        List<List<Integer>> ans = permutations.permute(myInput);
        System.out.println(ans);

    }
}
