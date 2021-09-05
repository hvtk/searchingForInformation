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

    public void giveTheExpertiseType() {
        switch (problemExpertiseTypes) {
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
