public class ArraysLecture {


    public static void main(String[] args) {
//        double [] prices = new double[3];
//
//        prices[0] = 1.0;
//        prices[1] = 2.0;
//        prices[2] = 3.0;
//
//        System.out.println("prices[0] = " + prices[0]);
//        System.out.println("prices[2] = " + prices[2]);
//        System.out.println("prices.length = " + prices.length);
//
//        String[] languages = {"html", "css", "javascript", "java"};
//        //loop through and print out each item in the array
//        for (int i = 0; i < languages.length; i++){
//            System.out.println(languages[i]);
//        }
//        // does the exact same thing:
//        for (String language : languages){
//            System.out.println(language);
//        }

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // access the first element in the second row
        //System.out.println(matrix[1][0]); // 4

        // the last element in the first row
        //System.out.println(matrix[0][2]); // 3

        // the first element in the last row
        //System.out.println(matrix[2][0]); // 7

        /*We can also iterate over the rows in a matrix,
        and, within the loop iterating over the rows, iterate
        over each element in each row with a nested loop:*/
        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");

//        for(int i = 0; i < matrix.length; i++){
//            System.out.println("+---+---+---+");
//
//            System.out.print("| ");
//
//            for (int c = 0; c < matrix.length; c++){
//                System.out.println(matrix[i][c] + " | ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("+---+---+---+");
    }
}
