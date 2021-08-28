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

        ArrayList<Expertise>expertiseAvailable = new ArrayList<Expertise>();

        Scanner expertiseNames = new Scanner(System.in);
        System.out.println("Below are printed expertise options. Select which expertise available is.");
        System.out.println("Choice 1: Fear knowledge");
        System.out.println("Choice 2: Panic knowledge");
        System.out.println("Choice 3: Depression knowledge");
        System.out.println("Choice 4: Addiction knowledge");
        System.out.println("Choice 5: Burnout knowledge");
        System.out.println("Choice 6: Suicide knowledge");
        System.out.print("The choice is: ");

        String expertiseNameChoice = expertiseNames.nextLine();
        String choiceExpertiseName = expertiseNameChoice;

        System.out.println("The choice that is made is number: " + choiceExpertiseName);

        Scanner moreChoices = new Scanner(System.in);
        System.out.print("Is there another expertise available? Type Y (yes) or N (no): ");
        String extraChoices = moreChoices.nextLine();
        for (int choices = 0; choices <= 6; choices++) {
            if (extraChoices.equals("Y")) {
                System.out.print("The next choice is: ");
            }
            else {
                System.out.println("There are no more choices!");
            }
            String choiceExpertiseName2 = expertiseNames.nextLine();
            if (choiceExpertiseName2.equals("2")) ;
            Expertise ce2 = new Expertise("Panic knowledge");
            expertiseAvailable.add(ce2);
            System.out.println("The expertiseName is: " + ce2);
            System.out.println("The values in array: expertiseAvailable are: " + expertiseAvailable);
            if (choiceExpertiseName2.equals("3")) ;
            Expertise ce3 = new Expertise("Depression knowledge");
            expertiseAvailable.add(ce3);
            System.out.println("The expertiseName is: " + ce3);
            System.out.println("The values in array: expertiseAvailable are: " + expertiseAvailable);
            if (choiceExpertiseName2.equals("4")) ;
            Expertise ce4 = new Expertise("Addiction knowledge");
            expertiseAvailable.add(ce4);
            System.out.println("The expertiseName is: " + ce4);
            System.out.println("The values in array: expertiseAvailable are: " + expertiseAvailable);
            if (choiceExpertiseName2.equals("5")) ;
            Expertise ce5 = new Expertise("Addiction knowledge");
            expertiseAvailable.add(ce5);
            System.out.println("The expertiseName is: " + ce5);
            System.out.println("The values in array: expertiseAvailable are: " + expertiseAvailable);
            if (choiceExpertiseName2.equals("6")) ;
            Expertise ce6 = new Expertise("Burnout knowledge");
            expertiseAvailable.add(ce6);
            System.out.println("The expertiseName is: " + ce6);
            System.out.println("The values in array: expertiseAvailable are: " + expertiseAvailable);
            if (choiceExpertiseName2.equals("1")) ;
            Expertise ce1 = new Expertise("Addiction knowledge");
            expertiseAvailable.add(ce1);
            System.out.println("The expertiseName is: " + ce1);
            System.out.println("The values in array: expertiseAvailable are: " + expertiseAvailable);

        }







        AidWorker organisation1 = new AidWorker("Jan Jansen ", "www.janjansen.nl");
       // organisation1.addExpertise(e1);
       //organisation1.addExpertise(e2);
      //  System.out.println(organisation1.toString());

        // zorg dat de waarde in de scanner gebruikt kan worden als invulling van de arraylist voor expertiseAvailable
        // maak een list met alle geselecteerde expertise namen.
        // Deze lijst hoort bij de gekozen aidworker of treatment, welke weer een onderdeel is van de in de arraylist genoemde aidworkers of treatments.
        // er moet net zo lang geselecteerd kunnen worden als mogelijk. Ook moet er een opties zijn om een knowledge toe te voegen.
    }
}




