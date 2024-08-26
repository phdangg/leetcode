package Array_Hashing;

public class NumberStudentsUnableToEat {
    public static int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        int count = 0,idxStack = 0, idxQueue = 0;
        while (idxStack < n && count < n) {
            while (students[idxQueue]==-1)
                idxQueue = (idxQueue+1) % n;
            while (sandwiches[idxStack]==-1) idxStack++;
            if (students[idxQueue] == sandwiches[idxStack]) {
                students[idxQueue] = -1;
                sandwiches[idxStack] = -1;
                idxStack++;
                count=0;
            }
            count++;
            idxQueue = (idxQueue+1) % n;
        }
        count = 0;
        for (int i : students) if (i != -1) count++;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countStudents(new int[]{1,1,0,0},new int[]{0,1,0,1}));
    }
}
