class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result=0;
        Map<Character,Integer> map = new LinkedHashMap <Character,Integer>();
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }
            else{
                i=map.get(ch); 
                map.clear();
            }
            if(map.size()>result){
                result=map.size();
            }
        }
        return result;
    }
}
