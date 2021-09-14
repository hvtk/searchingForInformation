public class ExpertiseNamesByPhysicalViolence extends Expertise {

    private String expertiseNameBPV;

    public ExpertiseNamesByPhysicalViolence() {
        super();
        expertiseNameBPV = "";
    }

    public ExpertiseNamesByPhysicalViolence(ExpertiseGroups expertiseGroups, String expertiseNameBPV) {
        super(expertiseGroups);
        this.expertiseNameBPV = expertiseNameBPV;
    }

    public String getExpertiseNameBPV() {
        return expertiseNameBPV;
    }

    public void setExpertiseNameBPV(String expertiseNameBPV) {
        this.expertiseNameBPV = expertiseNameBPV;
    }

    public void giveTheExpertiseNameByTheChoiceFromPhysicalViolence() {
        switch (expertiseNameBPV) {
            case "1":
                setExpertiseNameBPV("Dometic violence");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBPV() );
                break;
            case "2":
                setExpertiseNameBPV("Child abuse");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBPV() );
                break;
            case "3":
                setExpertiseNameBPV("Violence");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBPV() );
                break;
            default:
                expertiseNameBPV = "No choice has been made.";
        }
        System.out.println("The selected expertise is: " + expertiseNameBPV);
    }
}
