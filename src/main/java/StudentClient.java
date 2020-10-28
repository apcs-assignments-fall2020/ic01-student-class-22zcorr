public class StudentClient {
    public static void main(String[] args) {
        Student a = new Student("Bobby", "Marlin", 2020);
        System.out.println(a);

        Student b = new Student(2024);
        System.out.println(b);

        a.doSomething();



    }
}