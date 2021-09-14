public class ExpertiseNamesByMentalHealthProblems extends Expertise {

    private String expertiseNameBMHP;

    public ExpertiseNamesByMentalHealthProblems() {
        super();
        expertiseNameBMHP = "";
    }

    public ExpertiseNamesByMentalHealthProblems(ExpertiseGroups expertiseGroups, String expertiseNameBMHP){
        super(expertiseGroups);
        this.expertiseNameBMHP = expertiseNameBMHP;
    }

    public String getExpertiseNameBMHP() {
        return expertiseNameBMHP;
    }

    public void setExpertiseNameBMHP(String expertiseNameBMHP) {
        this.expertiseNameBMHP = expertiseNameBMHP;
    }

    public void giveTheExpertiseNameByTheChoiceFromMentalHealthProblems() {
        switch (expertiseNameBMHP) {
            case "1":
                setExpertiseNameBMHP("Fear knowledge");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBMHP());
                break;
            case "2":
                setExpertiseNameBMHP("Panic knowledge");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBMHP());
                break;
            case "3":
                setExpertiseNameBMHP("Depression knowledge");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBMHP());
                break;
            case "4":
                setExpertiseNameBMHP("Addiction knowledge");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBMHP());
                break;
            case "5":
                setExpertiseNameBMHP("Burnout knowledge");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBMHP());
                break;
            case "6":
                setExpertiseNameBMHP("Suicide knowledge");
                System.out.println("De aanwezige expertise is " + getExpertiseNameBMHP());
                break;
            default:
                expertiseNameBMHP = "No choice has been made.";
        }
        System.out.println("The selected expertise is: " + expertiseNameBMHP);
    }
}
