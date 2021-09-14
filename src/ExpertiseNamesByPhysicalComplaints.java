public class ExpertiseNamesByPhysicalComplaints extends Expertise {

    private String expertiseNameBPC;

    public ExpertiseNamesByPhysicalComplaints() {
        super();
        expertiseNameBPC = "";
    }

    public ExpertiseNamesByPhysicalComplaints(ExpertiseGroups expertiseGroups, String expertiseNameBPC) {
        super(expertiseGroups);
        this.expertiseNameBPC = expertiseNameBPC;
    }

    public String getExpertiseNameBPC() {
        return expertiseNameBPC;
    }

    public void setExpertiseNameBPC(String expertiseNameBPC) {
        this.expertiseNameBPC = expertiseNameBPC;
    }

    public void giveTheExpertiseNameByTheChoiceFromPhysicalComplaints() {
        switch (expertiseNameBPC) {
            case "1":
                setExpertiseNameBPC("Abdominal pains");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBPC() );
                break;
            case "2":
                setExpertiseNameBPC("Headache");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBPC() );
                break;
            case "3":
                setExpertiseNameBPC("Constant tiredness");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBPC() );
                break;
            case "4":
                setExpertiseNameBPC("Palpitations");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBPC() );
                break;
            case "5":
                setExpertiseNameBPC("Intestinal complains");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBPC() );
                break;
            case "6":
                setExpertiseNameBPC("Sore muscles and joints");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBPC() );
                break;
            default:
                expertiseNameBPC = "No choice has been made.";
        }
        System.out.println("The selected expertise is: " + expertiseNameBPC);
    }
}
