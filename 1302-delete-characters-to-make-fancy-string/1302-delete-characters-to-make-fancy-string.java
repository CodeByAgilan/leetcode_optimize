// class Solution {
//     public String makeFancyString(String s) {
//         if(s.length()<3){
//             return s;
//         }
//         int count=1;
//         String str="";
//         for(int i=1;i<s.length();i++){
//             if(s.charAt(i-1)==s.charAt(i)){
//                 if(count<2){
//                     str+=s.charAt(i-1);
//                     count++;
//                 }
//             }
//             else{
//                 count=1;
//                 str+=s.charAt(i-1);
//             }
//         }
//         if(s.charAt(s.length()-1)==s.charAt(s.length()-2)){
//             if(count<3){
//                 str+=s.charAt(s.length()-1);
//             }
//         }
//         else{
//                str+=s.charAt(s.length()-1);
//         }
//         return str;
//     }
// }

class Solution {

    public String makeFancyString(String s) {
        char prev = s.charAt(0);
        int frequency = 1;
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == prev) {
                // If the current character is equal to the previous character, increment the
                // frequency.
                frequency++;
            } else {
                // Otherwise, we can restart the frequency counter with 1, and store the current
                // character's value in prev.
                prev = s.charAt(i);
                frequency = 1;
            }
            // If the frequency counter has value less than 3, add the character to the
            // answer string.
            if (frequency < 3) ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}