package Array_Hashing;

public class NumberofSeniorCitizens {
    public static int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details) {
            String age = detail.substring(11,13);
            if (Integer.parseInt(age) > 60) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSeniors(new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"}));
    }
}
