package Array_Hashing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KidsWiththeGreatestNumberofCandies_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        return Arrays.stream(candies).mapToObj(candy -> {
            if (candy + extraCandies >= max) return new Boolean(true);
            else return new Boolean(false);
        }).collect(Collectors.toList());
    }
}
