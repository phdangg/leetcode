package Array_Hashing;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter_2942 {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++)
            if (words[i].indexOf(x) >= 0) ans.add(i);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findWordsContaining(new String[] {"leet","code"}, 'e'));
    }
}
