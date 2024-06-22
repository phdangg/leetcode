package Array_Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringEncodeDecode_271 {
    public static String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for (String str : strs){
            result.append(str.length()).append("#").append(str);
        }
        return result.toString();
    }

    public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        if (str.isEmpty()) return result;
        int i = 0;
        while (i < str.length() - 1){
            StringBuilder length = new StringBuilder();
            for (int j = i; ; j++){
                if (Character.isDigit(str.charAt(j)))
                    length.append(str.charAt(j));
                else break;
            }
            int wordLength = Integer.parseInt(length.toString());
            int numberOfDigit = length.toString().length() + 1;
            result.add(str.substring(i + numberOfDigit, i + numberOfDigit + wordLength));
            i += numberOfDigit + wordLength;
        }
        return result;
    }

    public static void main(String[] args) {
        String en = encode(Arrays.asList("VeryLongStringWithoutAnySpacesOrSpecialCharactersRepeatedManyTimesVeryLongStringWithoutAnySpacesOrSpecialCharactersRepeatedManyTime"));
        System.out.println(decode(en));
    }
}
