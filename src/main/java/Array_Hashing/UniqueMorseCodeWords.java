package Array_Hashing;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> transform = new HashSet<>();
        for (String word : words){
            StringBuilder encode = new StringBuilder();
            for (char c : word.toCharArray()) encode.append(morse[c-'a']);
            transform.add(encode.toString());
        }
        return transform.size();
    }
}
