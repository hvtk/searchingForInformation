public class Problem {
    String problemName;
    ProblemTypes problemTypes;

    public Problem(ProblemTypes problemTypes) {
        this.problemTypes = problemTypes;

    }

    public void giveTheProblemType() {
       switch (problemTypes) {
           case PHYSICALVIOLENCE:
               System.out.println("The problemtype is Physicalviolence");
               break;

           case EMOTIONALPROBLEMS:
               System.out.println("The problemtype is emotionalproblems");
               break;

           case PHYSICALCOMPLAINTS:
               System.out.println("The problemtype is physicalcomplaints");
               break;

           case MENTHALHEALTHPROBLEMS:
               System.out.println("The problemtype is menthalhealthproblems");
               break;

           default:
               System.out.println("The is no resistant problemtype selected!");
               break;
       }
    }
}
