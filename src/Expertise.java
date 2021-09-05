public class Expertise {

    private String expertiseName;
    private ProblemExpertiseTypes problemExpertiseTypes;

    public Expertise(String expertiseName) {
        this.expertiseName = expertiseName;
    }

    public String getExpertiseName() {
        return expertiseName;
    }

    public void setExpertiseName(String expertiseName) {
        this.expertiseName = expertiseName;
    }

    public ProblemExpertiseTypes getProblemExpertiseTypes() {
        return problemExpertiseTypes;
    }

    public void setProblemExpertiseTypes(ProblemExpertiseTypes problemExpertiseTypes) {
        this.problemExpertiseTypes = problemExpertiseTypes;
    }

    public void giveTheExpertiseByGroup() {
        switch(problemExpertiseTypes) {
            case EMOTIONALPROBLEMS:
                Expertise eg1 = new Expertise("");
                eg1.giveTheExpertiseNameByTheChoiceFromEmotionalProblems();
                break;
            case MENTHALHEALTHPROBLEMS:
                Expertise eg2 = new Expertise("");
                eg2.giveTheExpertiseNameByTheChoiceFromMentalHealthProblems();
                break;
            case PHYSICALCOMPLAINTS:
                Expertise eg3 = new Expertise("");
                eg3.giveTheExpertiseNameByTheChoiceFromPhysicalComplaints();
                break;
            case PHYSICALVIOLENCE:
                Expertise eg4 = new Expertise("");
                eg4.giveTheExpertiseNameByTheChoiceFromPhysicalViolence();
                break;
            default:
                expertiseName = "No choice has been made.";
        }

    }

    public void giveTheExpertiseNameByTheChoiceFromMentalHealthProblems() {
        switch (expertiseName) {
            case "1":
                setExpertiseName("Fear knowledge");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            case "2":
                setExpertiseName("Panic knowledge");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            case "3":
                setExpertiseName("Depression knowledge");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            case "4":
                setExpertiseName("Addiction knowledge");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            case "5":
                setExpertiseName("Burnout knowledge");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            case "6":
                setExpertiseName("Suicide knowledge");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            default:
                expertiseName = "No choice has been made.";
        }
        System.out.println("The selected expertise is: " + expertiseName);
    }

    public void giveTheExpertiseNameByTheChoiceFromPhysicalViolence() {
        switch (expertiseName) {
            case "1":
                setExpertiseName("Dometic violence");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            case "2":
                setExpertiseName("Child abuse");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            case "3":
                setExpertiseName("Violence");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            default:
                expertiseName = "No choice has been made.";
        }
        System.out.println("The selected expertise is: " + expertiseName);
    }

    public void giveTheExpertiseNameByTheChoiceFromPhysicalComplaints() {
        switch (expertiseName) {
            case "1":
                setExpertiseName("Abdominal pains");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            case "2":
                setExpertiseName("Headache");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            case "3":
                setExpertiseName("Constant tiredness");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            case "4":
                setExpertiseName("Palpitations");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            case "5":
                setExpertiseName("Intestinal complains");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            case "6":
                setExpertiseName("Sore muscles and joints");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            default:
                expertiseName = "No choice has been made.";
        }
        System.out.println("The selected expertise is: " + expertiseName);
    }

    public void giveTheExpertiseNameByTheChoiceFromEmotionalProblems() {
        switch (expertiseName) {
            case "1":
                setExpertiseName("Self confidence");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            case "2":
                setExpertiseName("Stressed out");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            case "3":
                setExpertiseName("Worry about");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            case "4":
                setExpertiseName("Guilty feelings");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            case "5":
                setExpertiseName("Loneliness");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            default:
                expertiseName = "No choice has been made.";
        }
        System.out.println("The selected expertise is: " + expertiseName);
    }

    public String toString() {
    return expertiseName + "";
    }
}
