public class DoorTest {
    public static void main(String[] args) {
        Door metalDoor = new Door("metal");
        System.out.println("metalDoor.isOpen() = " + metalDoor.isOpen());

        metalDoor.close();
        metalDoor.open();
        System.out.println("metalDoor.isOpen() = " + metalDoor.isOpen());
    }

}
