# General Method

we usually need two functions, 

1. `union` as helper function whose return type should be the same as its input type.
2. `implementation` as a execute function

```java
public List<List<Integer>> implementation(int[] nums){
    
    Set<List<Integer>> set = new HashSet<>();
    while(){
        set = union(set); // most important
    }
}
public Set<List<Integer>> union(Set<List<Integer>> set){
    Set<List<Integer>> ans = new HashSet<>();
    // do something
    return ans;
}
```

One important issue is that, in order to avoid duplicated values, we need to use `Set` frequently.

# Questions

## permutations

[code](permutations.java)

### tips

1. we need to copy the `List<Integer>` and then add Integer in it, don't add in-place

   ```java
   for(List<Integer> b : box){
       for(int i = 0; i <= b.size(); i++){
           List<Integer> newB = new ArrayList<>(b); // make a copy of b;
           newB.add(i, n);
           ans.add(newB);
       }
           }
   ```

   



## word search

use `trace matrix` to record which grid has been traced.

[code](Word_Search.java)

### pitfalls

don't forget to restore the trace matrix.

### tips

we can use `board[x][y] ^= 128` to replace the `trace matrix`.