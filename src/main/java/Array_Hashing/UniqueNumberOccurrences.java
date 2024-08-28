package Array_Hashing;

public class UniqueNumberOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        int[] c = new int[2001];
        int[] c2 = new int[1001];
        for (int n : arr) c[n+1000]++;
        for (int n : c) if (n!=0) c2[n]++;
        for (int n : c2) if (n!=0 && n!=1) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[] {1,2,2,1,1,3}));
    }
}
