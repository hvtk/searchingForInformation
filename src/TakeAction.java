public class TakeAction {

    TakeActionTypes takeActionTypes;
    private String takeActionName;
    private String takeActionWebAddress;

    public TakeAction() {
    }

    public TakeActionTypes getTakeActionTypes() {
        return takeActionTypes;
    }

    public void setTakeActionTypes(TakeActionTypes takeActionTypes) {
        this.takeActionTypes = takeActionTypes;
    }

    public String getTakeActionName() {
        return takeActionName;
    }

    public void setTakeActionName(String takeActionName) {
        this.takeActionName = takeActionName;
    }

    public String getTakeActionWebAddress() {
        return takeActionWebAddress;
    }

    public void setTakeActionWebAddress(String takeActionWebAddress) {
        this.takeActionWebAddress = takeActionWebAddress;
    }
}
