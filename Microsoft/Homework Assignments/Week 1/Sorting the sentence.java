class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        String str1="";
        for(int i=1;i<=str.length;i++){
            for(int j=0;j<str.length;j++){
                if(str[j].endsWith(Integer.toString(i))){
                    str1+=str[j].substring(0,str[j].length()-1)+" ";
                }
                
            }
        }
        return str1.trim();
    }
}
