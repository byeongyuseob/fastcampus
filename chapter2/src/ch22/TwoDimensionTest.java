package ch22;

public class TwoDimensionTest {
    public static void main(String[] args) {
        int[][] arr = {{232, 597, 380, 967, 608}, {268, 839, 97, 861, 87}};

        int i, j;

        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr[k].length; l++) {
                System.out.print(arr[k][l] + ",");
            }
            System.out.println("\t" + arr[k].length);
        }
    }
}
