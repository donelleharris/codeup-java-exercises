public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }
    public String getName(){
        //return the person's name
        return this.name;
    }

    public void setName(String name){
        //change the name property to the passed value
        this.name = name;
    }

    public void sayHello(){
        //print a message to the console using the person's name
        System.out.printf("Hello my name is %s.\n", this.name);
    }

    public static void main(String[] args) {
        Person john = new Person("John");
        Person jon = new Person("John");
        System.out.println(john.getName().equals(jon.getName()));
        System.out.println(john == jon);
        john.sayHello();
        System.out.println("john.getName() = " + john.getName());
        john.setName("Johnathan Swift");
        john.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("Cory");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
