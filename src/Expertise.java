import java.util.ArrayList;

public class Expertise {

    String expertiseName;
    ArrayList<String> expertiseAvailable = new ArrayList<String>();

    public Expertise() {
    }

    public String getExpertiseName() {
        return expertiseName;
    }

    public void setExpertiseName(String expertiseName) {
        this.expertiseName = expertiseName;
    }

    public ArrayList<String> returnExpertiseAvailable() {
        return expertiseAvailable;
    }

    public void addExpertiseAvailable( int expertiseFromAidWorker) {
        expertiseAvailable.add(expertiseFromAidWorker);
    }
}
