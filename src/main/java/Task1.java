public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            if (arr[i] == 1){
                System.out.print(0);
            } else System.out.print(1);
        }
    }
}
