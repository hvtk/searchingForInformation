import java.util.ArrayList;

public class AidWorker {

   AidWorkerTypes aidWorkerTypes;
   private String aidWorkersName;
   private String aidWorkersWebAddress;

    public AidWorker() {
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
}
