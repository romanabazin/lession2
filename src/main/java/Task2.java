public class Task2 {
    public static void main(String[] args) {
        int [] arr = new int [8];
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(i*3 +" ");
        }
    }
}
