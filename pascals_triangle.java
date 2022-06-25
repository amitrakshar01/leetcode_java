import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        if(numRows == 0){
            return pascal;
        }
        List<Integer> f_row = new ArrayList<>();
        f_row.add(1);
        pascal.add(f_row);
        
        for(int i = 1; i < numRows; i++){
            List<Integer> p_row = pascal.get(i-1);
            List<Integer> c_row = new ArrayList<>();
            
            c_row.add(1);
            
            for(int j = 1; j < i; j++){
                c_row.add(p_row.get(j-1) + p_row.get(j));
            }
            c_row.add(1);
            pascal.add(c_row);
        }
        return pascal;
    }
}
