package java_start.array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] student = new int[4][3];
        int [] total = new int[4];
        double [] avg = new double[4];
        for(int i=0; i<student.length; i++){
            System.out.println((i+1) +"번 학생의 성적을 입력하세요 :");
            for(int j=0; j<student[i].length;j++){
                switch (j){
                    case 0:
                        System.out.print("국어 점수 :");
                        break;
                    case 1:
                        System.out.print("영어 점수 :");
                        break;
                    case 2:
                        System.out.print("수학 점수 :");
                        break;
                }
                student[i][j]=sc.nextInt();
                total[i] += student[i][j];
                if(j==student[i].length-1){
                  avg[i]=total[i]/3;
                }
            }
        }
        for(int i=0; i<4;i++){
            System.out.println((i+1)+"번 학생의 총점: "+ total[i]+ ", 평균: "+avg[i]);
        }


    }
}
