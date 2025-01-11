package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int [] student;
        student = new int [5];

        student[0]= 90;
        student[1]= 80;
        student[2]= 70;
        student[3]= 60;
        student[4]= 50;

        for(int i =0; i<student.length ;i++){
            System.out.println("학생 " +(i+1)+" 점수 "+student[i] );
        }
    }
}
