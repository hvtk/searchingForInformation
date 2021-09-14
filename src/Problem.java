public class Problem {
    private String problemName;
    private ProblemTypes problemTypes;

    public Problem(ProblemTypes problemTypes) {
        this.problemTypes = problemTypes;
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public ProblemTypes getProblemTypes() {
        return problemTypes;
    }

    public void setProblemTypes(ProblemTypes problemTypes) {
        this.problemTypes = problemTypes;
    }
}

