import AssessmentFeed;


public abstract class Student {
    private String name;
    private int cid;
    private String studentType;
    private float moduleMark;

    public Student(String name, int cid, String studentType, String assessment, double percentageMark, float moduleMark) {
        this.name = name;
        this.cid = cid;
        this.studentType = studentType;
        this.moduleMark = moduleMark;
    }

    public int getCID() {
        return cid;
    }

    public String getMame() {
        return name;
    }

    public String getStudentType() {
        return studentType;
    }

    public float getModuleMark() {
        return moduleMark;
    }

}

public abstract class Assessment {
    private String assessmentName;
    private double percentageMark;

    public Assessment(String assessmentName, double percentageMark) {
        this.assessmentName = assessmentName;
        this.percentageMark = percentageMark;
    }
}
