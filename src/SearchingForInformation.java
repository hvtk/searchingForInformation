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

        Problem dometicViolence = new Problem(ProblemTypes.PHYSICALVIOLENCE);
        Problem childAbuse = new Problem(ProblemTypes.PHYSICALVIOLENCE);
        Problem violence = new Problem(ProblemTypes.PHYSICALVIOLENCE);

        Problem abdominalPains = new Problem(ProblemTypes.PHYSICALCOMPLAINTS);
        Problem headache = new Problem(ProblemTypes.PHYSICALCOMPLAINTS);
        Problem constantTiredness = new Problem(ProblemTypes.PHYSICALCOMPLAINTS);
        Problem palpitations = new Problem(ProblemTypes.PHYSICALCOMPLAINTS);
        Problem intestinalComplains = new Problem(ProblemTypes.PHYSICALCOMPLAINTS);
        Problem soreMusclesAndJoints = new Problem(ProblemTypes.PHYSICALCOMPLAINTS);

        Problem fear = new Problem(ProblemTypes.MENTHALHEALTHPROBLEMS);
        Problem panic = new Problem(ProblemTypes.MENTHALHEALTHPROBLEMS);
        Problem depression = new Problem(ProblemTypes.MENTHALHEALTHPROBLEMS);
        Problem addiction = new Problem(ProblemTypes.MENTHALHEALTHPROBLEMS);
        Problem burnout = new Problem(ProblemTypes.MENTHALHEALTHPROBLEMS);
        Problem suicide = new Problem(ProblemTypes.MENTHALHEALTHPROBLEMS);

        Problem selfConfidence = new Problem(ProblemTypes.EMOTIONALPROBLEMS);
        Problem stressedOut = new Problem(ProblemTypes.EMOTIONALPROBLEMS);
        Problem worryAbout = new Problem(ProblemTypes.EMOTIONALPROBLEMS);
        Problem guiltyFeelings = new Problem(ProblemTypes.EMOTIONALPROBLEMS);
        Problem loneliness = new Problem(ProblemTypes.EMOTIONALPROBLEMS);

        Scanner problem_type = new Scanner(System.in);
        System.out.print("Enter your problem: ");
        String firstProblem = problem_type.nextLine();
        System.out.println("The selected problem is: " + firstProblem);

    }
}


