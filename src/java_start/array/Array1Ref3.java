package java_start.array;

public class Array1Ref3 {
    public static void main(String[] args) {
        int [] student;
        student = new int []{90,80,70,60,50}; //배열 생성과 초기화

        for(int i =0; i<student.length ;i++){
            System.out.println("학생 " +(i+1)+" 점수 "+student[i] );
        }
    }
}
