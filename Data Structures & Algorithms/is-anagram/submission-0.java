class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
        System.out.println("Not Anagrams");
        return false;
        }
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        java.util.Arrays.sort(c1);
        java.util.Arrays.sort(c2);
        return java.util.Arrays.equals(c1, c2);
    }
}
