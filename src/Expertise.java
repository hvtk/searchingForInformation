public class Expertise {

    private String expertiseName;

    public Expertise(String expertiseName) {
        this.expertiseName = expertiseName;
    }

    public String getExpertiseName() {
        return expertiseName;
    }

    public void setExpertiseName(String expertiseName) {
        this.expertiseName = expertiseName;
    }

    public void giveTheExpertiseNameByTheChoice() {
        switch (expertiseName) {
            case "1":
                setExpertiseName("Fear knowledge");
                System.out.println("De aanwezige expertise is " + getExpertiseName() );
                break;
            case "2":
                expertiseName = "Panic knowledge";
                break;
            case "3":
                expertiseName = "Depression knowledge";
                break;
            case "4":
                expertiseName = "Addiction knowledge";
                break;
            case "5":
                expertiseName = "Burnout knowledge";
                break;
            case "6":
                expertiseName = "Suicide knowledge";
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
