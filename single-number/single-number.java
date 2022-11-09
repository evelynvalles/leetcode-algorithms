class Solution {
    public int singleNumber(int[] nums) {
        
        Set<Integer> s = new HashSet<>();
        int l = nums.length;
        
        for( int i = 0; i < l; i++ ){
            if( s.contains( nums[i] ) ){
                s.remove( nums[i] );
            }else{
                s.add( nums[i] );
            }
        }
        return  s.toArray(new Integer[1] )[0] ;
    }
}