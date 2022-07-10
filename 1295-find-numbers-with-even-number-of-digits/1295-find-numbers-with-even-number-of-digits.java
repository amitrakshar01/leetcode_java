class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    
    static boolean even(int n){
        int c = 0;
        while(n>0){
            n/=10;
            c++;
        }
        if(c%2 == 0){
            return true;
        }
        return false;
    }
    
}