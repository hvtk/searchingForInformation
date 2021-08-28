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

    public void giveTheExpertiseNameByTheChoice() {

        // if (choiceExpertiseName2.equals("1")) ;
        //   Expertise ce1 = new Expertise("Addiction knowledge");
        // expertiseAvailable.add(ce1);
        //  System.out.println("The expertiseName is: " + ce1);
        //  System.out.println("The values in array: expertiseAvailable are: " + expertiseAvailable);
        //  if (choiceExpertiseName2.equals("2")) ;
        //  Expertise ce2 = new Expertise("Panic knowledge");
        //  expertiseAvailable.add(ce2);
        //   System.out.println("The expertiseName is: " + ce2);
        //  System.out.println("The values in array: expertiseAvailable are: " + expertiseAvailable);
        //  if (choiceExpertiseName2.equals("3")) ;
        //  Expertise ce3 = new Expertise("Depression knowledge");
        //   expertiseAvailable.add(ce3);
        //   System.out.println("The expertiseName is: " + ce3);
        //   System.out.println("The values in array: expertiseAvailable are: " + expertiseAvailable);
        //  if (choiceExpertiseName2.equals("4")) ;
        //  Expertise ce4 = new Expertise("Addiction knowledge");
        //   expertiseAvailable.add(ce4);
        //  System.out.println("The expertiseName is: " + ce4);
        //  System.out.println("The values in array: expertiseAvailable are: " + expertiseAvailable);
        //  if (choiceExpertiseName2.equals("5")) ;
        //  Expertise ce5 = new Expertise("Addiction knowledge");
        //   expertiseAvailable.add(ce5);
        //  System.out.println("The expertiseName is: " + ce5);
        //   System.out.println("The values in array: expertiseAvailable are: " + expertiseAvailable);
        //  if (choiceExpertiseName2.equals("6")) ;
        //  Expertise ce6 = new Expertise("Burnout knowledge");
        //  expertiseAvailable.add(ce6);
        //  System.out.println("The expertiseName is: " + ce6);
        //  System.out.println("The values in array: expertiseAvailable are: " + expertiseAvailable);

        String choice = "1";
        String expertiseName;
        switch (choice) {
            case "1":
                expertiseName = "Fear knowledge";
                break;
            case "2":
                expertiseName = "Panic knowledge";
                break;
            case "3":
                expertiseName = "Depression knowledge";
                break;
            case "4":
                expertiseName = "Addiction knowledge";
                break;
            case "5":
                expertiseName = "Burnout knowledge";
                break;
            case "6":
                expertiseName = "Suicide knowledge";
                break;
            default:
                expertiseName = "No choice has been made.";
        }
        System.out.println("The selected expertise is: " + expertiseName);
    }

    public String toString() {
    return expertiseName + "";
    }
}
