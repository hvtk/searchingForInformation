import java.awt.*;
import java.util.ArrayList;

public class AidWorker {

    AidWorkerTypes aidWorkerTypes;
    private String aidWorkersName;
    private String aidWorkersWebAddress;
    private ArrayList<Expertise> expertiseAvailable;


    public AidWorker(String aidWorkersName, String aidWorkersWebAddress, java.util.ArrayList<Expertise> expertiseAvailable) {
        this.aidWorkersName = aidWorkersName;
        this.aidWorkersWebAddress = aidWorkersWebAddress;
        this.expertiseAvailable = expertiseAvailable;
    }
    public AidWorker(String aidWorkersName, String aidWorkersWebAddress) {
        this.aidWorkersName = aidWorkersName;
        this.aidWorkersWebAddress = aidWorkersWebAddress;
        expertiseAvailable = new ArrayList<Expertise>();
    }

    public AidWorkerTypes getAidWorkerTypes() {
        return aidWorkerTypes;
    }

    public void setAidWorkerTypes(AidWorkerTypes aidWorkerTypes) {
        this.aidWorkerTypes = aidWorkerTypes;
    }

    public String getAidWorkersName() {
        return aidWorkersName;
    }

    public void setAidWorkersName(String aidWorkersName) {
        this.aidWorkersName = aidWorkersName;
    }

    public String getAidWorkersWebAddress() {
        return aidWorkersWebAddress;
    }

    public void setAidWorkersWebAddress(String aidWorkersWebAddress) {
        this.aidWorkersWebAddress = aidWorkersWebAddress;
    }

    public ArrayList<Expertise> getExpertiseAvailable() {
        return expertiseAvailable;
    }

    public void setExpertiseAvailable(ArrayList<Expertise> expertiseAvailable) {
        this.expertiseAvailable = expertiseAvailable;
    }

    public void addExpertise(Expertise expertise) {
        expertiseAvailable.add(expertise);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AidWorker ").append(aidWorkersName).append("").append(aidWorkersWebAddress).append(" heeft de volgende expertises:");

        for (Expertise inhabitant : expertiseAvailable) {
            stringBuilder.append("\n\r").append(inhabitant.toString()).append(".");
        }
        stringBuilder.append("\n\r");
        return stringBuilder.toString();
    }
}
