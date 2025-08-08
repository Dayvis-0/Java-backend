package ifThenElse_2;
public class IfTheElse {
    static void applyBrakes() {
        boolean isMoving = true;
        int currentSpeed = 0;
        if(!isMoving){
            currentSpeed--;
        } else {
            System.out.println("The bicycle has already stopped");
        }
    }
    public static void main(String[] args) {
        applyBrakes();
        
        int testscore = 76;
        char grade;
        
        if(testscore >= 90){
            grade = 'A';
        } else if (testscore >= 80){
            grade = 'B';
        } else if (testscore >= 70){
            grade = 'C';
        } else if (testscore >= 60){
            grade = 'D';
        }
        else {
            grade = 'D';
        }

        System.out.println("Grade = " + grade);
    }
}