/*Create a Building class with two subclasses namely, House and School. The Building
class contains fields for square footage and stories. The House class contains
additional fields for number of bedrooms and baths. The School class contains
additional fields for number of classrooms and grade level (for example, elementary
or junior high). All the classes contain appropriate overloaded constructors and
methods to display the details. In a separate class that contains main(), demonstrate
the working of this hierarchy.*/
import java.util.Scanner;
class Building {
     double squareFootage;
     int stories;

    public Building(double squareFootage, int stories) {
        this.squareFootage = squareFootage;
        this.stories = stories;
    }

    public void displayDetails() {
        System.out.println("Square Footage: " + squareFootage + " sq ft");
        System.out.println("Stories: " + stories);
    }

static class House extends Building {
     int bedrooms;
     int baths;

    public House(double squareFootage, int stories, int bedrooms, int baths) {
        super(squareFootage, stories);
        this.bedrooms = bedrooms;
        this.baths = baths;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Baths: " + baths);
    }
    static class School extends Building {
         int classrooms;
         String gradeLevel;

        public School(double squareFootage, int stories, int classrooms, String gradeLevel) {
            super(squareFootage, stories);
            this.classrooms = classrooms;
            this.gradeLevel = gradeLevel;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Classrooms: " + classrooms);
            System.out.println("Grade Level: " + gradeLevel);
        }
    }
     @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a House object
        System.out.println("Enter details for House:");
        System.out.print("Square Footage: ");
        double houseSquareFootage = sc.nextDouble();
        System.out.print("Stories: ");
        int houseStories = sc.nextInt();
        System.out.print("Bedrooms: ");
        int houseBedrooms = sc.nextInt();
        System.out.print("Baths: ");
        int houseBaths = sc.nextInt();

        House house = new House(houseSquareFootage, houseStories, houseBedrooms, houseBaths);
        System.out.println("\nHouse Details:");
        house.displayDetails();

        // Create a School object
        System.out.println("\nEnter details for School:");
        System.out.print("Square Footage: ");
        double schoolSquareFootage = sc.nextDouble();
        System.out.print("Stories: ");
        int schoolStories = sc.nextInt();
        System.out.print("Classrooms: ");
        int schoolClassrooms = sc.nextInt();
        System.out.print("Grade Level: ");
        String schoolGradeLevel = sc.next();

        School school = new School(schoolSquareFootage, schoolStories, schoolClassrooms, schoolGradeLevel);
        System.out.println("\nSchool Details:");
        school.displayDetails();

        sc.close();
    }
}
}