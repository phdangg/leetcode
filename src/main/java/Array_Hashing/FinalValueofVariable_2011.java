package Array_Hashing;

public class FinalValueofVariable_2011 {
    public static int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String op : operations){
            if (op.contains("-")) result--;
            else result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[] {"X++","++X","--X","X--"}));
    }
}
