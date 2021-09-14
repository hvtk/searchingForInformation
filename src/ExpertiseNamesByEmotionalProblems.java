public class ExpertiseNamesByEmotionalProblems extends Expertise {

    private String expertiseNameBEP;

    public ExpertiseNamesByEmotionalProblems() {
        super();
        expertiseNameBEP = "";
    }

    public ExpertiseNamesByEmotionalProblems(ExpertiseGroups expertiseGroups, String expertiseNameBEP) {
        super(expertiseGroups);
        this.expertiseNameBEP = expertiseNameBEP;
    }

    public String getExpertiseNameBEP() {
        return expertiseNameBEP;
    }

    public void setExpertiseNameBEP(String expertiseNameBEP) {
        this.expertiseNameBEP = expertiseNameBEP;
    }

    public void giveTheExpertiseNameByTheChoiceFromEmotionalProblems() {
        switch (expertiseNameBEP) {
            case "1":
                setExpertiseNameBEP("Self confidence");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBEP() );
                break;
            case "2":
                setExpertiseNameBEP("Stressed out");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBEP() );
                break;
            case "3":
                setExpertiseNameBEP("Worry about");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBEP() );
                break;
            case "4":
                setExpertiseNameBEP("Guilty feelings");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBEP() );
                break;
            case "5":
                setExpertiseNameBEP("Loneliness");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBEP() );
                break;
            default:
                expertiseNameBEP = "No choice has been made.";
        }
        System.out.println("The selected expertise is: " + expertiseNameBEP);
    }
}
