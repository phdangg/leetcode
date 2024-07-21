package Array_Hashing;

import java.util.List;

public class CheckifaStringIsanAcronymofWords {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) return false;
        for (int i = 0; i  < words.size(); i++){
            if (words.get(i).charAt(0) != s.charAt(i)) return false;
        }
        System.out.println();
        return true;
    }
}
