package java_mid_1.lang.enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for(AuthGrade value : values){
            System.out.println("grade : "+ value.name() + " Level : "+ value.getLevel()+" description : "+ value.getDescription() );
        }
    }
}
