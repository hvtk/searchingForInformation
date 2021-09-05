public class Problem {
    private String problemName;
    private ProblemExpertiseTypes problemExpertiseTypes;

    public Problem(ProblemExpertiseTypes problemExpertiseTypes) {
        this.problemExpertiseTypes = problemExpertiseTypes;
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public ProblemExpertiseTypes getProblemExpertiseTypes() {
        return problemExpertiseTypes;
    }

    public void setProblemExpertiseTypes(ProblemExpertiseTypes problemExpertiseTypes) {
        this.problemExpertiseTypes = problemExpertiseTypes;
    }

    //to give a overview from the existing problemtypes after selection from a problemgroup in SearchingForInformation
    public void giveTheProblemType() {
       switch (problemExpertiseTypes) {
           case PHYSICALVIOLENCE:
               Expertise eg1 = new Expertise("");
               System.out.println("The problemtype is Physicalviolence");
               System.out.println("Choose one of the options below:");
               System.out.println("Choice 1: dometic violence");
               System.out.println("Choice 2: child abuse");
               System.out.println("Choice 3: violence");
               break;

           case EMOTIONALPROBLEMS:
               System.out.println("The problemtype is emotionalproblems");
               System.out.println("Choose one of the options below:");
               System.out.println("Choice 1: self confidence");
               System.out.println("Choice 2: stressed out");
               System.out.println("Choice 3: worry about");
               System.out.println("Choice 4: guilty feelings");
               System.out.println("Choice 5: loneliness");
               break;

           case PHYSICALCOMPLAINTS:
               System.out.println("The problemtype is physicalcomplaints");
               System.out.println("Choose one of the options below:");
               System.out.println("Choice 1: abdominalPains");
               System.out.println("Choice 2: headache");
               System.out.println("Choice 3: constant tiredness");
               System.out.println("Choice 4: palpitations");
               System.out.println("Choice 5: intestinal complains");
               System.out.println("Choice 6: sore muscles and joints");
               break;

           case MENTHALHEALTHPROBLEMS:
               System.out.println("The problemtype is menthalhealthproblems");
               System.out.println("Choose one of the options below:");
               System.out.println("Choice 1: fear");
               System.out.println("Choice 2: panic");
               System.out.println("Choice 3: depression");
               System.out.println("Choice 4: addiction");
               System.out.println("Choice 5: burnout");
               System.out.println("Choice 6: suicide");
               break;
       }
    }
}

