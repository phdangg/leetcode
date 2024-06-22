package Array_Hashing;


public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26]; // 26 characters in alphabet
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int j : count) {
            if (j != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        ValidAnagram_242 main = new ValidAnagram_242();
        System.out.println(main.isAnagram("zasv","zsva"));
    }
}
