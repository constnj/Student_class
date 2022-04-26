public class Main {

    public static void main(String[] args) {
        Student stud = new Aspirant("ivan", "ivanov", "4", 3.0);

        Student[] arr = new Student[3];
        arr[0] = new Student("Elena", "Abramova", "7", 4.6);
        arr[1] = new Student("Pavel", "Georgiev", "3", 5.0);
        arr[2] = new Aspirant("Alejandro", "Sanz", "4", 6.2);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getScholarship());
        }
    }



}
