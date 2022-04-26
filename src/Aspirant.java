public class Aspirant extends Student {

    Aspirant(String fn, String ln, String g, double am) {
        super(fn, ln, g, am);
    }

    public String getScholarship() {
        if (averageMark == 5.0) {
            return "200 р";
        } else {
            return "180 р";
        }
    }
}
