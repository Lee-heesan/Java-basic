package java_start.array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int [] student = {90,80,70,60,50,40,30,20,10}; //배열 생성과 초기화

        for(int i =0; i<student.length ;i++){
            System.out.println("학생 " +(i+1)+" 점수 "+student[i] );
        }
    }
}
