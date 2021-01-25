package Week8;

public class Student {
    private String studentID;
    private String name;
    private String DOB;
    private String emailAddress;
    private String patName;
    private String patEmailAddress;

    public Student(String studentID, String name, String DOB,
                   String emailAddress, String patName,
                   String patEmailAddress) {
        this.studentID = studentID;
        this.name = name;
        this.DOB = DOB;
        this.emailAddress = emailAddress;
        this.patName = patName;
        this.patEmailAddress = patEmailAddress;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getDOB() {
        return DOB;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPatName() {
        return patName;
    }

    public String getPatEmailAddress() {
        return patEmailAddress;
    }

    public static void main(String[] args) {
        System.out.println("Creating New Student");
        Student dawid = new Student("u2070689", "Dawid Dlugosz",
                "03/10/1995", "u2070689@unimail.hud.ac.uk",
                "Ann Smith","a.smith@hud.ac.uk");
        System.out.println("Printing Student Details");
        System.out.println(dawid.getName());
        System.out.println(dawid.getStudentID());
        System.out.println("Setting Student Date of Birth");
        System.out.println(dawid.getDOB());
        System.out.println("Setting Student Email");
        System.out.println(dawid.getEmailAddress());
        System.out.println("Setting Student PAT");
        System.out.println(dawid.getPatName());
        System.out.println("Setting Student PAT Email");
        System.out.println(dawid.getPatEmailAddress());

    }
}
