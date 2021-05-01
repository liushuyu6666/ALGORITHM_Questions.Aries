package Prime;

import java.util.*;

public class Group_Anagrams {

    public List<List<String>> groupAnagrams(String[] strs){
        // generate prime
        int primeBound = 120;
        boolean[] prime = new boolean[primeBound];
        prime[0] = false;
        prime[1] = false;
        Arrays.fill(prime, true);
        for(int i = 2; i * i < primeBound; i++){
            if(prime[i]){
                for(int j = i * i; j < primeBound; j = j + i){
                    prime[j] = false;
                }
            }
        }

        HashMap<Character, Integer> map = new HashMap<>();
        char c = 'a';
        for(int i = 2; i < primeBound && c <= 'z'; i++ ){
            if(prime[i]){
                map.put(c, i);
                c++;
            }
        }

        long eigenvalue;
        HashMap<Long, List<String>> ants = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            eigenvalue = 1;
            for(int j = 0; j < strs[i].length(); j++){
                eigenvalue = eigenvalue * map.get(strs[i].charAt(j));
            }
            // ants.put(eigenvalue, ants.getOrDefault(eigenvalue, new ArrayList<>()).add(strs[i]));
            List<String> nested = ants.getOrDefault(eigenvalue, new ArrayList<>());
            nested.add(strs[i]);
            ants.put(eigenvalue, nested);
        }
        List<List<String>> ans = new ArrayList<>();
        for(List<String> ll : ants.values()){
            ans.add(ll);
        }
        return ans;
    }

    public static void main(String args[]){
        Group_Anagrams group_anagrams = new Group_Anagrams();
        String[] strs = {"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"};
        System.out.println(group_anagrams.groupAnagrams(strs));
    }
}
