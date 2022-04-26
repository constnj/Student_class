public class Student {
    public String firstName = "Kostya";
    public String lastName = "Borodin";
    public String group = "0";

    public double averageMark;

    Student(String fn, String ln, String g, double am) {
        this.firstName = fn;
        this.lastName = ln;
        this.group = g;
        this.averageMark = am;
    }

    public String getScholarship() {
        if (averageMark == 5.0) {
            return "100 р";
        } else {
            return "80 р";
        }
    }
}
