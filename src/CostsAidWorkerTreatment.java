public class CostsAidWorkerTreatment {

    private String costsAidWorkerTreatmentPart;
    private Boolean answerYesOrNo;

    public CostsAidWorkerTreatment(Boolean answerYesOrNo) {
        this.answerYesOrNo = answerYesOrNo;
    }

    public Boolean getAnswerYesOrNo() {
        return answerYesOrNo;
    }

    public void setAnswerYesOrNo(Boolean answerYesOrNo) {
        this.answerYesOrNo = answerYesOrNo;
    }


    public void healthInsurance(Boolean answerYesOrNo) {
        if(answerYesOrNo == true) {
        System.out.println("The treatment is covered by health insurance");
        } else {
        System.out.println("The treatment is not covered by health insurance");
        }
    }

    public void referNecessaryFamilyDoctor(Boolean answerYesOrNo){
        if(answerYesOrNo == true) {
            System.out.println("For the treatment is refer from the family doctor necessary, to get reimbursement of health insurance");
        } else {
            System.out.println("For the treatment is refer from the family doctor not necessary, to get reimbursement of health insurance");
        }
    }
}
