abstract class Developer extends Employee{

    public Developer(String name, String department) {
        super(name, department);
    }
    public Developer(String name) {
        super(name, "Development");
    }
    public String work() {
        return "writing code";
    }
}
