import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        double totalGrade = (0.00);
        int totalWeight = (0);
        double totalWeightedGrade = (0.0);
        String letterGrade = "N/A";

        while (loop){
            System.out.println("Welcome to the Student Grade Calculator!");
            System.out.println("Please select an option:");
            System.out.println("0. Exit grade calculator");
            System.out.println("1. Check your current grade");
            System.out.println("2. Enter a new assignment grade");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 2:
                    System.out.println("Please enter the name of your assignment: ");
                    String assignmentName = scanner.nextLine();

                    System.out.println("Please enter the assignment grade (pts.): ");
                    double assignmentGrade = scanner.nextDouble();

                    System.out.println("Please enter the assignment weight (pts.): ");
                    int assignmentGradeWeight = scanner.nextInt();
                    scanner.nextLine();

                    totalGrade += assignmentGrade;
                    totalWeight += assignmentGradeWeight;

                    totalWeightedGrade = (totalGrade / totalWeight)*100;

                    if (totalWeightedGrade >= 90) {
                        letterGrade = "A";}
                    else if (totalWeightedGrade >= 80) {
                        letterGrade = "B";}
                    else if (totalWeightedGrade >= 70) {
                        letterGrade = "C";}
                    else if (totalWeightedGrade >= 60) {
                        letterGrade = "D";}
                    else if (totalWeightedGrade < 0) {
                        System.out.println("Error: Invalid Grade or Weight Input");
                        System.out.println(" ");
                        System.out.println("**************************************************");
                        System.out.println(" ");
                        break;}
                    else {
                        letterGrade = "E";}


                    System.out.println("You added " + assignmentName + " to your gradebook!");
                    System.out.printf("Your total grade is: %.2f%%. You have a(n) " +letterGrade+ "!", totalWeightedGrade);
                    System.out.println(" ");
                    System.out.println("**************************************************");
                    System.out.println(" ");
                    break;

                case 1:
                    System.out.printf("Your current grade is: %.2f%%. You have a(n) " +letterGrade+ "!", totalWeightedGrade);
                    System.out.println(" ");
                    System.out.println("**************************************************");
                    System.out.println(" ");
                    break;

                case 0:
                    System.out.println("Exiting Student Grade Calculator. Goodbye!");
                    System.out.println(" ");
                    System.out.println("**************************************************");
                    System.out.println(" ");
                    loop = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    System.out.println(" ");
                    break;


            }

        }

    }
}
