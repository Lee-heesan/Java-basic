package array;

public class ArrayEx1 {
    public static void main(String[] args) {
        int [] student = {90,80,70,60,50};
        int total = 0;
        
        for (int i : student) {
            total += i;
        }
        double avg = (double) total/student.length;

        System.out.println("total = " + total);
        System.out.println("avg = " + avg);
    }
}
