package Array_Hashing;

public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        int length = 0;
        String prefix = "";
        for (String word : words){
            if (length >= k) return result.toString();
            result.append(prefix);
            prefix = " ";
            result.append(word);
            length++;
        }
        return result.toString();
    }
}
