class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet a=new HashSet(),b=new HashSet();
        for(int i=0;i<s.length()-9;i++){
            String str=s.substring(i,i+10);
            if(a.contains(str)){
                b.add(str);
            }
            a.add(str);
        }
        return new ArrayList(b);
    }
}
