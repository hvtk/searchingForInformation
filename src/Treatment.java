public class Treatment {

    TreatmentTypes treatmentTypes;
    private String treatmentName;
    private String treatmentWebAddress;

    public Treatment() {
    }

    public TreatmentTypes getTreatmentTypes() {
        return treatmentTypes;
    }

    public void setTreatmentTypes(TreatmentTypes treatmentTypes) {
        this.treatmentTypes = treatmentTypes;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    public String getTreatmentWebAddress() {
        return treatmentWebAddress;
    }

    public void setTreatmentWebAddress(String treatmentWebAddress) {
        this.treatmentWebAddress = treatmentWebAddress;
    }
}
