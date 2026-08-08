class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int n:nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        int res=0;
        for(int n:nums){
            if(m.get(n)==1){
                res=n;
            }
        }
        return res;
    }
}