import java.util.*;

public class SearchingForInformation {
    public static void main(String[] args) {

        Scanner userInformation = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter the username: ");
        String username = userInformation.nextLine();
        System.out.print("Enter the password: ");
        String password = userInformation.nextLine();
        System.out.print("Enter your age: ");
        String age = userInformation.nextLine();
        System.out.print("Enter your postalcode: ");
        String postalCode = userInformation.nextLine();

        System.out.println("The userinformation is:");
        System.out.println("Username: " + username);
        System.out.println("Password: " +  password);
        System.out.println("Age: " + age);
        System.out.println("Postalcode: " + postalCode);

        Scanner problem_type = new Scanner(System.in);
        System.out.println("Make a choice of one of the problem-groups below: ");
        System.out.println("Choice 1: Emotional problems");
        System.out.println("Choice 2: Menthal health problems");
        System.out.println("Choice 3: Physical complaints");
        System.out.println("Choice 4: Physical violence");
        System.out.print("The choice is: ");

        int firstProblem = problem_type.nextInt();

        int choice = firstProblem;
        System.out.println("The choice number is: " + choice);
        if (choice == 4) {
            String problem4 = "PHYSICALVIOLENCE";
            Problem p4 = new Problem(ProblemTypes.valueOf(problem4));
            p4.giveTheProblemType();
        }
        if (choice == 3) {
            String problem3 = "PHYSICALCOMPLAINTS";
            Problem p3 = new Problem(ProblemTypes.valueOf(problem3));
            p3.giveTheProblemType();
        }
        if (choice == 2) {
            String problem2 = "MENTHALHEALTHPROBLEMS";
            Problem p2 = new Problem(ProblemTypes.valueOf(problem2));
            p2.giveTheProblemType();
        }
        if (choice == 1) {
            String problem1 = "EMOTIONALPROBLEMS";
            Problem p1 = new Problem(ProblemTypes.valueOf(problem1));
            p1.giveTheProblemType();
        }
        if (choice >4) {
            System.out.println("There is not a resistant choice selected!");
        }
    }
}




