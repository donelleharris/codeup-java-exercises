public class Employee extends Person {
    public Employee(String employeeName){
        super(employeeName);
    }

    private double salary;
    public void doWork() {
        System.out.println("Work, work...");
    }
    public String work() {
        return "Filling out TPS reports";
    }
    public void sayHello(){
        System.out.println("How can I help you?");
    }
    public static void main(String[] args) {
        Employee john = new Employee("John");
        john.sayHello();
        System.out.println(john.name);
        Person p = new Person("Joe");
        Employee e = new Employee("Sally");

        p.sayHello();
        e.sayHello(); // prints "Hello, World!"
        e.doWork(); // prints "Work, work..."
    }
}
