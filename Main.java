import java.util.Scanner;
// i was here
// Student class with basic student information handling
class Student {
      int rollNumber;
      int marks;

    // Read roll number from user input
      void getRollNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        this.rollNumber = sc.nextInt();
    }

    // Display roll number
      void putRollNum() {
        System.out.println("Roll Number: " + rollNumber);
    }

    // Read marks from user input
      void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        this.marks = sc.nextInt();
    }

    // Display marks
      void putMarks() {
        System.out.println("Marks: " + marks);
    }

    // Getter for marks (needed for result calculation)
      int getMarksValue() {
        return marks;
    }
}

// Sports interface for sports-related functionality
interface Sports {
    void putSportsScore(int score); // Implement this to set sports score
}

// Result class combining academic and sports performance
class Result extends Student implements Sports {
      int sportsScore;

    // Set sports score (implementation of Sports interface)
    @Override
      public void putSportsScore(int score) {
        this.sportsScore = score;
    }

    // Display comprehensive result
      void displayResult() {
        putRollNum();
        putMarks();
        System.out.println("Sports Score: " + sportsScore);
        System.out.println("Total Score: " + (getMarksValue() + sportsScore));
    }
}

// Example usage
@SuppressWarnings("unused")
  class Main {
      static public void main(String[] args) {
        Result studentResult = new Result();
        
        // Get student details
        studentResult.getRollNum();
        studentResult.getMarks();
        
        // Set sports score
        studentResult.putSportsScore(92); // Direct score input
        
        // Display full result
        System.out.println("\n=== Student Result ===");
        studentResult.displayResult();
    }
}
