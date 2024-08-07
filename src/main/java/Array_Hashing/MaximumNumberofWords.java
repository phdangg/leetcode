package Array_Hashing;

public class MaximumNumberofWords {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(String sentence : sentences){
            String[] words = sentence.split( " ");
            max = Math.max(max,words.length);
        }
        return max;
    }
}
