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

        Scanner health_insurance = new Scanner(System.in);
        System.out.println("Is there a refer from the family doctor necessary?");
        System.out.print("Type Y (yes) or N (no): ");

        String referFamilyDoctor = health_insurance.next();
        String refer = referFamilyDoctor;

        if(refer.equals("Y")) {
          CostsAidWorkerTreatment c1 = new CostsAidWorkerTreatment(true);
          c1.setAnswerYesOrNo(true);
          c1.referNecessaryFamilyDoctor(true);
          c1.healthInsurance(true);
        }

        if(refer.equals("N")) {
            CostsAidWorkerTreatment c2 = new CostsAidWorkerTreatment(false);
            c2.setAnswerYesOrNo(false);
            c2.referNecessaryFamilyDoctor(false);
            c2.healthInsurance(false);
        }

      //  ArrayList<Integer> expertiseAvailable = new ArrayList<Integer>();

        Expertise e1 = new Expertise("");

        Scanner expertiseNames = new Scanner(System.in);
        e1.expertiseOptions();

        String expertiseNameChoice = expertiseNames.next();
        e1.setExpertiseName(expertiseNameChoice);
        System.out.println(e1);

      //  expertiseAvailable.add(expertiseNames.nextInt());

       // if (expertiseNameChoice == 1);
       // Expertise e1 = new Expertise("Fear knowledge");
       // System.out.println("De available expertise is: " + e1);

       // if (expertiseNameChoice == 2);
       // Expertise e2 = new Expertise("Panic knowledge");
      //  System.out.println("De available expertise is: " + e2);

        //if (expertiseNameChoice == 3);
        //Expertise e3 = new Expertise("Depression knowledge");
        //System.out.println("De available expertise is: " + e3);

        //if (expertiseNameChoice == 4);
        //Expertise e4 = new Expertise("Addiction knowledge");
        //System.out.println("De available expertise is: " + e4);

        //if (expertiseNameChoice == 5);
        //Expertise e5 = new Expertise("Burnout knowledge");
        //System.out.println("De available expertise is: " + e5);

        //if (expertiseNameChoice == 6);
        //Expertise e6 = new Expertise("Suicide knowledge");
        //System.out.println("De available expertise is: " + e6);

       // Scanner anotherExpertiseAvailable = new Scanner(System.in);
       // System.out.println("Is there another knowledge available? ");
      //  System.out.print("Type Y (yes) or N (no): ");
      //  String anotherExpertise = anotherExpertiseAvailable.next();
     //   String aE = anotherExpertise;

      //  if (aE.equals("N"));
      //  System.out.println("There are no more expertise options.");

       // if (aE.equals("Y"));
      //  System.out.println("Select another expertise. ");



        AidWorker organisation1 = new AidWorker("Jan Jansen", "www.janjansen.nl");

        // zorg dat de waarde in de scanner gebruikt kan worden als invulling van de arraylist voor expertiseAvailable
        // maak een list met alle geselecteerde expertise namen.
        // Deze lijst hoort bij de gekozen aidworker of treatment, welke weer een onderdeel is van de in de arraylist genoemde aidworkers of treatments.
        // er moet net zo lang geselecteerd kunnen worden als mogelijk. Ook moet er een opties zijn om een knowledge toe te voegen.
    }
}




