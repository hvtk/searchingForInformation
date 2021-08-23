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

    public void expertiseOptions() {
        System.out.println("Below are printed expertise options. Select which expertise available is.");
        System.out.println("Choice 1: Fear knowledge");
        System.out.println("Choice 2: Panic knowledge");
        System.out.println("Choice 3: Depression knowledge");
        System.out.println("Choice 4: Addiction knowledge");
        System.out.println("Choice 5: Burnout knowledge");
        System.out.println("Choice 6: Suicide knowledge");
        System.out.print("The available knowledge is: ");
    }

    @Override
    public String toString() {
        return expertiseName + "";
    }
}
