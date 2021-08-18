import java.util.ArrayList;

public class Expertise {

    private int expertiseName;
    private ArrayList<Integer> expertiseAvailable = new ArrayList<Integer>();

    public Expertise(int expertiseName) {
        this.expertiseName = expertiseName;
    }

    public int getExpertiseName() {
        return expertiseName;
    }

    public void setExpertiseName(int expertiseName) {
        this.expertiseName = expertiseName;
    }

    public ArrayList<Integer> returnExpertiseAvailable()
    {return expertiseAvailable; }

    public void addExpertiseAvailable(String aidWorkerName) {
        expertiseAvailable.add(aidWorkerName);
    }
}
