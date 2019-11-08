import Person.Student;

public class A11dot2{
    public static void main(String[] args) {
      person p = new Person("Bob", "123 North", "555-1234", "bob@bob.com") ;
      System.out.println(p); 
      Student s = new Student("Ann", "234 South", "555-3456", "ann@ann.com", "")
    }
}
class Person{
    String name;
    String address;
    String phone;
    String email;
    person () {
        Person( String name, String address, String phone, String email){
            this.String name;
            this.String address;
            this.String phone;
            this.String email;
        }
        public String toString(){
            return "Person -" + name + "lives at" + address;
        }
    }
    class Student extends Person{
        String status;
        Student(){

        }
        Student(String name, String address, String phone, String email, String status ){
            this.status;
        }
        public String toString(){
            return "Student - " + name + "is a" + status;
        }
    }
    class Employee extends Person;
    
}