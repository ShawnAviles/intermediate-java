import java.util.*;

public class Ex7_1 {
    public static int getBestGrade(int[] grades) {
        int best = grades[0];
        for (int i = 1; i < grades.length; i++) {
          if (grades[i] > best) { best = grades[i]; }
        }
        return best;
    }

    public static char getGrade(int grade, int best) {
        char c;
        if (grade >= best - 10) { c = 'A'; }
        else if (grade >= best - 20) { c = 'B'; }
        else if (grade >= best - 30) { c = 'C'; }
        else if (grade >= best - 40) { c = 'D'; }
        else { c = 'F'; }
        return c;
      }
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter the number of students: ");
        int students = input.nextInt();
        System.out.println("Enter " + students + " scores: ");
        int[] grades = new int[students];
        for (int i=0; i <= grades.length - 1; i++) {
            grades[i] = input.nextInt();
        } 

        int bestGrade = getBestGrade(grades);
        input.close();
        
        for (int i = 0; i < grades.length; i++) {
            char grade = getGrade(grades[i], bestGrade);
            System.out.println("Student " + i + " score is " + grades[i] +
              " and grade is " + grade);
          }
        }
}