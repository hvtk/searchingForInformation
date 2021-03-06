import java.util.*;

public class SearchingForInformation {

    public static void main(String[] args) {

        //input user information
        Scanner userInformation = new Scanner(System.in);
        System.out.print("Enter the username: ");
        String username = userInformation.nextLine();
        System.out.print("Enter the password: ");
        String password = userInformation.nextLine();
        System.out.print("Enter your age: ");
        String age = userInformation.nextLine();
        System.out.print("Enter your postalcode: ");
        String postalCode = userInformation.nextLine();
        User user1 = new User(username, password, age, postalCode);

        //an overview of the entered data
        System.out.println("The userinformation is:");
        System.out.println("Username: " + username);
        System.out.println("Password: " +  password);
        System.out.println("Age: " + age);
        System.out.println("Postalcode: " + postalCode);

        //select a problem group from enum ProblemTypes
        Scanner problem_type = new Scanner(System.in);
        System.out.println("Make a choice of one of the problem-groups below: ");
        System.out.println("Choice 1: Emotional problems");
        System.out.println("Choice 2: Mental health problems");
        System.out.println("Choice 3: Physical complaints");
        System.out.println("Choice 4: Physical violence");
        System.out.print("The choice is: ");

        //gives a overview of the different problemtypes inside a problemgroup
        int firstProblem = problem_type.nextInt();
        int choice = firstProblem;
        System.out.println("The choice number is: " + choice);
        if (choice == 1) {
            String problem1 = "EMOTIONALPROBLEMS";
            Problem p1 = new Problem(ProblemTypes.valueOf(problem1));
            ProblemTypes.emotionalProblems();
        }
        if (choice == 2) {
            String problem2 = "MENTALHEALTHPROBLEMS";
            Problem p2 = new Problem(ProblemTypes.valueOf(problem2));
            ProblemTypes.mentalHealthProblems();
        }
        if (choice == 3) {
            String problem3 = "PHYSICALCOMPLAINTS";
            Problem p3 = new Problem(ProblemTypes.valueOf(problem3));
            ProblemTypes.physicalComplaints();
        }
        if (choice == 4) {
            String problem4 = "PHYSICALVIOLENCE";
            Problem p4 = new Problem(ProblemTypes.valueOf(problem4));
            ProblemTypes.physicalViolence();
        }
        if (choice >4) {
            System.out.println("There is not a resistant choice selected!");
        }

        //select a aidworker group from enum AidWorkerTypes
        Scanner aidWorker_group = new Scanner(System.in);
        System.out.println("Make a choice of one of the aidworker-groups below: ");
        System.out.println("Choice 1: Institution");
        System.out.println("Choice 2: Organisation");
        System.out.println("Choice 3: Specialist");
        System.out.print("The choice is: ");
        int choiceAidWorkerGroup = aidWorker_group.nextInt();
        int choiceAG = choiceAidWorkerGroup;
        System.out.println("The choice number is: " + choiceAG);
        if (choiceAG == 1) {
            String aidWorkerType1 = "INSTITUTION";
            AidWorker at1 = new AidWorker(AidWorkerTypes.valueOf(aidWorkerType1));
            at1.giveTheAidWorkerType();
        }
        if (choiceAG == 2) {
            String aidWorkerType2 = "ORGANISATION";
            AidWorker at2 = new AidWorker(AidWorkerTypes.valueOf(aidWorkerType2));
            at2.giveTheAidWorkerType();
        }
        if (choiceAG == 3) {
            String aidWorkerType3 = "SPECIALIST";
            AidWorker at3 = new AidWorker(AidWorkerTypes.valueOf(aidWorkerType3));
            at3.giveTheAidWorkerType();
        }
        if (choiceAG >3) {
            System.out.println("There is not a resistant choice selected!");
        }

        //input aidworker information
        Scanner aidWorkerInformation = new Scanner(System.in);
        System.out.print("Enter the aidworkersname: ");
        String aidWorkerName = aidWorkerInformation.nextLine();
        String aidWorkerName1 = aidWorkerName;
        System.out.print("Enter the aidworkerswebaddress: ");
        String aidWorkerWebAddress = userInformation.nextLine();
        String aidWorkerWebAddress1 = aidWorkerWebAddress;
        System.out.println("De aidworker heet: " + aidWorkerName1 + " en heeft als webadres: " + aidWorkerWebAddress1);
        AidWorker a1 = new AidWorker(aidWorkerName, aidWorkerWebAddress);

        //select a expertise group from enum ExpertiseGroup
        Scanner expertise_group = new Scanner(System.in);
        System.out.println("Make a choice of one of the expertise-groups below: ");
        System.out.println("Choice 1: Expertise in Emotional problems");
        System.out.println("Choice 2: Expertise in Mental health problems");
        System.out.println("Choice 3: Expertise in Physical complaints");
        System.out.println("Choice 4: Expertise in Physical violence");
        System.out.print("The choice is: ");

        //gives a overview of the different expertisenames inside a expertisegroup
        int nameExpertiseGroup = expertise_group.nextInt();
        int choiceEG = nameExpertiseGroup;
        System.out.println("The choice number is: " + choiceEG);
        if (choiceEG == 1) {
            String expertiseGroup1 = "EMOTIONALPROBLEMS";
            Expertise e1 = new Expertise(ExpertiseGroups.valueOf(expertiseGroup1));
            ExpertiseGroups.emotionalProblems();
        }
        if (choiceEG == 2) {
            String expertiseGroup2 = "MENTALHEALTHPROBLEMS";
            Expertise e2 = new Expertise(ExpertiseGroups.valueOf(expertiseGroup2));
            ExpertiseGroups.mentalHealthProblems();
        }
        if (choiceEG == 3) {
            String expertiseGroup3 = "PHYSICALCOMPLAINTS";
            Expertise e3 = new Expertise(ExpertiseGroups.valueOf(expertiseGroup3));
            ExpertiseGroups.physicalComplaints();
        }
        if (choiceEG == 4) {
            String expertiseGroup4 = "PHYSICALVIOLENCE";
            Expertise p4 = new Expertise(ExpertiseGroups.valueOf(expertiseGroup4));
            ExpertiseGroups.physicalViolence();
        }
        if (choice >4) {
            System.out.println("There is not a resistant choice selected!");
        }

        Scanner expertiseNames = new Scanner(System.in);
        System.out.print("The choice is: ");

        String expertiseNameChoice = expertiseNames.nextLine();
        String choiceExpertiseName = expertiseNameChoice;

        System.out.println("The choice that is made is number: " + choiceExpertiseName);

        //to make a arraylist from available expertise per aidworker
        ArrayList<Expertise>expertiseAvailable = new ArrayList<Expertise>();
        //bedenken hoe je de keuze van de expertisegroep kan verwerken in de selectie van de expertisenaam, omdat de namen per expertisegroep verschillend zijn
        if(choiceExpertiseName.equals("2")) {
            ExpertiseNamesByEmotionalProblems eBEP1 = new ExpertiseNamesByEmotionalProblems();
            eBEP1.setExpertiseNameBEP("2");
            eBEP1.giveTheExpertiseNameByTheChoiceFromEmotionalProblems();
            expertiseAvailable.add(eBEP1);
        }

        {/* if (choiceExpertiseName.equals("1")) {
            Expertise e1 = new Expertise(choiceExpertiseName);
            expertiseAvailable.add(e1);
        }

        if (choiceExpertiseName.equals("2")) {
            Expertise e2 = new Expertise(choiceExpertiseName);
            e2.giveTheExpertiseNameByTheChoiceFromMentalHealthProblems();
            expertiseAvailable.add(e2);
        }

        if (choiceExpertiseName.equals("3")) {
            Expertise e3 = new Expertise(choiceExpertiseName);
            e3.giveTheExpertiseNameByTheChoiceFromMentalHealthProblems();
            expertiseAvailable.add(e3);
        }

        if (choiceExpertiseName.equals("4")) {
            Expertise e4 = new Expertise(choiceExpertiseName);
            e4.giveTheExpertiseNameByTheChoiceFromMentalHealthProblems();
            expertiseAvailable.add(e4);
        }

        if (choiceExpertiseName.equals("5")) {
            Expertise e5 = new Expertise(choiceExpertiseName);
            e5.giveTheExpertiseNameByTheChoiceFromMentalHealthProblems();
            expertiseAvailable.add(e5);
        }

        if (choiceExpertiseName.equals("6")) {
            Expertise e6 = new Expertise(choiceExpertiseName);
            e6.giveTheExpertiseNameByTheChoiceFromMentalHealthProblems();
            expertiseAvailable.add(e6);
        }*/}

        Scanner moreChoices = new Scanner(System.in);
        System.out.print("Is there another expertise available? Type Y (yes) or N (no): ");
        String extraChoices = moreChoices.nextLine();

        if (extraChoices.equals("Y")) {
            System.out.print("The next choice is: ");
        }
        else {
            System.out.print("The are no more choices!");
        }

        String choiceExpertiseName2 = expertiseNames.nextLine();
        String extraChoiceExpertiseName = choiceExpertiseName2;
        System.out.println("The extra choice that is made is number: " + extraChoiceExpertiseName);

        {/*    if (extraChoiceExpertiseName.equals("1")) {
            Expertise ce1 = new Expertise(extraChoiceExpertiseName);
            ce1.giveTheExpertiseNameByTheChoiceFromMentalHealthProblems();
            expertiseAvailable.add(ce1);
        }

        if (extraChoiceExpertiseName.equals("2")) {
            Expertise ce2 = new Expertise(extraChoiceExpertiseName);
            ce2.giveTheExpertiseNameByTheChoiceFromMentalHealthProblems();
            expertiseAvailable.add(ce2);
        }

        if (extraChoiceExpertiseName.equals("3")) {
            Expertise ce3 = new Expertise(extraChoiceExpertiseName);
            ce3.giveTheExpertiseNameByTheChoiceFromMentalHealthProblems();
            expertiseAvailable.add(ce3);
        }

        if (extraChoiceExpertiseName.equals("4")) {
            Expertise ce4 = new Expertise(extraChoiceExpertiseName);
            ce4.giveTheExpertiseNameByTheChoiceFromMentalHealthProblems();
            expertiseAvailable.add(ce4);
        }

        if (extraChoiceExpertiseName.equals("5")) {
            Expertise ce5 = new Expertise(extraChoiceExpertiseName);
            ce5.giveTheExpertiseNameByTheChoiceFromMentalHealthProblems();
            expertiseAvailable.add(ce5);
        }

        if (extraChoiceExpertiseName.equals("6")) {
            Expertise ce6 = new Expertise(extraChoiceExpertiseName);
            ce6.giveTheExpertiseNameByTheChoiceFromMentalHealthProblems();
            expertiseAvailable.add(ce6);
        }*/}

        //indicate if the refer from the family doctor is necessary for health insurance
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

        System.out.println("The available expertise is: " + expertiseAvailable.toString());

        //make a new aidworker. There will be come an input option later.
        AidWorker organisation1 = new AidWorker(aidWorkerName1, aidWorkerWebAddress1, expertiseAvailable);
        System.out.println(organisation1.toString());
        System.out.println("De aidworker-group is: " + choiceAG);
        System.out.println("Is er een verwijs van de huisarts nodig bij de gekozen expertise: " + refer);
        System.out.println("De nieuwe user heet: " + username + " Het gekozen wachtwoord is: " + password + " De leeftijd is: " + " jaar" + " En de postcode is: " + postalCode );

        // zorg dat de waarde in de scanner gebruikt kan worden als invulling van de arraylist voor expertiseAvailable
        // maak een list met alle geselecteerde expertise namen.
        // Deze lijst hoort bij de gekozen aidworker of treatment, welke weer een onderdeel is van de in de arraylist genoemde aidworkers of treatments.
        // er moet net zo lang geselecteerd kunnen worden als mogelijk. Ook moet er een opties zijn om een knowledge toe te voegen.
    }
}




