package Array_Hashing;

import java.util.Arrays;

public class NumberofEmployeesWhoMettheTarget_2798 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        return (int)Arrays.stream(hours).filter(n -> n >= target).count();
    }
}
