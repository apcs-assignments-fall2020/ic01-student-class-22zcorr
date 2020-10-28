public class Student extends Person {
   private int year;

   public Student(String first, String last, int year){
       super(first, last); // We are calling the contstructor from the parent class that takes two arguments
                           // the superclass (Person) that takes two arguments: new Person(a,b)
                           // this.firstName = a;
                           // this.lastName = b;
       this.year = year;
   }

   public Student(){
       super("Jerry","Seinfeld");
        // this.firstName = "Jerry";
        // this.lastName = "Seinfeld";
       this.year = 2024;
   }
   public void doSomething() {
        System.out.println(this.getFirstName()+" \'"+this.year%100+" is studying");
    }

   public Student(int c){
       // if you don't call super() it will do that automatically
       this.year = c;
   }
   public String toString(){
       return this.getFirstName() + " " + this.getLastName() + ", " + this.year;
   }
}