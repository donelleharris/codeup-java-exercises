public class PolymorphismDemo {
    public static void doWork(Employee e){
        System.out.println(e.work());
    }

    public static void main(String[] args) {
        Employee one = new Employee("Bob");
        Employee two = new Manager("Linda");

        doWork(one);
        doWork(two);
    }
}
