class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if(sLength != tLength)
            return false;
        Map<Character, Integer> anagramS = new HashMap<>();
        Map<Character, Integer> anagramT = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            anagramS.put(s.charAt(i), anagramS.getOrDefault(s.charAt(i), 0) + 1);
            anagramT.put(t.charAt(i), anagramT.getOrDefault(t.charAt(i), 0) + 1);   
        }
        return anagramS.equals(anagramT);
    }
}
