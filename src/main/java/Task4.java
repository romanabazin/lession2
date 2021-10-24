public class Task4 {
    public static void main(String[] args) {

        int[][] array = new int[4][4];
        printArray(array);
    }

    public static void printArray(int[][] arr) {
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                if (y == x) {System.out.print(1 + " ");
                } else System.out.print(arr[y][x] + " ");}
            System.out.println();
        }
    }
}