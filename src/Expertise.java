public class Expertise {

   // private String expertiseName;
    private ExpertiseTypes expertiseTypes;

    public Expertise(ProblemTypes problemTypes) {
        this.problemTypes = problemTypes;
    }

   // public Expertise(String expertiseName) {
     //   this.expertiseName = expertiseName;
   // }

   // public String getExpertiseName() {
   //     return expertiseName;
   // }

  //  public void setExpertiseName(String expertiseName) {
   //     this.expertiseName = expertiseName;
   // }

    public ProblemTypes getProblemExpertiseTypes() {
        return problemTypes;
    }

    public void setProblemExpertiseTypes(ProblemTypes problemTypes) {
        this.problemTypes = problemTypes;
    }

    public void giveTheExpertiseType() {
        switch (problemTypes) {
            case PHYSICALVIOLENCE:
                System.out.println("The expertisetype is Physicalviolence");
                System.out.println("Choose one of the options below:");
                System.out.println("Choice 1: dometic violence");
                System.out.println("Choice 2: child abuse");
                System.out.println("Choice 3: violence");
                break;

            case EMOTIONALPROBLEMS:
                System.out.println("The expertisetype is emotionalproblems");
                System.out.println("Choose one of the options below:");
                System.out.println("Choice 1: self confidence");
                System.out.println("Choice 2: stressed out");
                System.out.println("Choice 3: worry about");
                System.out.println("Choice 4: guilty feelings");
                System.out.println("Choice 5: loneliness");
                break;

            case PHYSICALCOMPLAINTS:
                System.out.println("The expertisetype is physicalcomplaints");
                System.out.println("Choose one of the options below:");
                System.out.println("Choice 1: abdominalPains");
                System.out.println("Choice 2: headache");
                System.out.println("Choice 3: constant tiredness");
                System.out.println("Choice 4: palpitations");
                System.out.println("Choice 5: intestinal complains");
                System.out.println("Choice 6: sore muscles and joints");
                break;

            case MENTHALHEALTHPROBLEMS:
                System.out.println("The expertisetype is menthalhealthproblems");
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








   // public String toString() {
   // return expertiseName + "";
   // }
}
