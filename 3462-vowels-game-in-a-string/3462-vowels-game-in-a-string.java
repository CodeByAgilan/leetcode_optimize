class Solution {
    public boolean doesAliceWin(String s) {
      return s.chars().anyMatch(c -> "aeiou".indexOf(Character.toLowerCase(c)) != -1);  
    }
}