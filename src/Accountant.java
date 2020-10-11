abstract class Accountant extends Employee {

    public Accountant(String name, String department) {
        super(name, "Accounting");
    }

    public String work() {
        return "holding meetings";
    }

    public static void main(String[] args) {


    }
}
