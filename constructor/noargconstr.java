class Student {
String name;
int rollNo;
// No-argument constructor
public Student() {
name = "Ram";
rollNo = 12;
System.out.println("No-arg constructor called");
}
}
public class noargconstr {
public static void main(String[] args) {
Student s1 = new Student(); // Calls no-arg constructor
System.out.println(s1.name);



System.out.println(s1.rollNo);
}
}