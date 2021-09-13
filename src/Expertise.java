public class Expertise {

   // private String expertiseName;
    private ExpertiseGroups expertiseGroups;

    public Expertise(ExpertiseGroups expertiseGroups) {
        this.expertiseGroups = expertiseGroups;
    }

   // public Expertise(String expertiseName) {
     //   this.expertiseName = expertiseName;
   // }

   // public String getExpertiseName() {
   //     return expertiseName;
   // }

  //  public void setExpertiseName(String expertiseName) {
   //     this.expertiseName = expertiseName;
   // }

    public ExpertiseGroups getExpertiseTypes() {
        return expertiseGroups;
    }

    public void setExpertiseTypes(ExpertiseGroups expertiseGroups) {
        this.expertiseGroups = expertiseGroups;
    }








   // public String toString() {
   // return expertiseName + "";
   // }
}
