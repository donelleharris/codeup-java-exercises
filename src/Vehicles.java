public class Vehicles {
    public static void main(String[] args) {
//        String[] thisIsAStringArray = {"Car", "Van", "Bike"};
//        int currentSize = myArray.length;
//        int newSize = currentSize + 1;
//        String[] tempArray = new String[ newSize ];
//
//        for (int i=0; i < currentSize; i++)
//        {
//            tempArray[i] = myArray [i];
//        }
//        tempArray[newSize- 1] = newItem;
//        myArray = tempArray;
//        for (String element:myArray ) {
//            System.out.println( element );
//        }
        //creates new String array
        String[] thisIsAStringArray = {"Car", "Van", "Bike"};
        //calls the "add" method and reassigns the original array to the new array
        thisIsAStringArray = add(thisIsAStringArray, "SUV");
        //prints out items in array
        for (String element:thisIsAStringArray) {
            System.out.println( element );
        }
//        String newItem = "SUV";
    }
    public static String[] add(String[] originalArray, String newItem)
    {
        int currentSize = originalArray.length;
        int newSize = currentSize + 1;
        String[] tempArray = new String[ newSize ];
        for (int i=0; i < currentSize; i++)
        {
            tempArray[i] = originalArray [i];
        }
        tempArray[newSize- 1] = newItem;
        return tempArray;
    }
}
