abstract class Employee {
    protected String name;
    protected String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

        public String getName() {
            return name;
        }
        public String getDepartment() {
            return department;
        }

        public abstract String work();
    }


// From Inheritance & Polymorphism Lesson:
//    public String work() {
//        return "Filling out TPS reports";
//    }
//    public void sayHello(){
//        System.out.println("How can I help you?");
//    }
//    public static void main(String[] args) {
//        Employee john = new Employee("John");
//        john.sayHello();
//        System.out.println(john.name);
//        Person p = new Person("Joe");
//        Employee e = new Employee("Sally");
//
//        p.sayHello();
//        e.sayHello(); // prints "Hello, World!"
//        e.doWork(); // prints "Work, work..."
//    }
//}
