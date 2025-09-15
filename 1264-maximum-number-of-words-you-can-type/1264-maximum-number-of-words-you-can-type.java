class Solution {
    public int canBeTypedWords(String text, String b) {
        String arr[]=text.split(" ");
        int count=0;
        for(int i=0;i<arr.length;i++){
            boolean bool=true;
            for(int j=0;j<arr[i].length();j++){
                for(int k=0;k<b.length();k++){
                    if(b.charAt(k)==arr[i].charAt(j)){
                    bool=false;
                    break;
                    }
                }
            }
            if(bool){
             count++;
            }
        }
        return count;
    }
}