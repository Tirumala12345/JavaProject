package forLoopDemo;

public class ForDemo {
    public static void main(String[] args) {
        int array[] = {6, 1, 8, 10, 3, 7, 2};
        System.out.println("Unsorted Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");
        }
        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min_index] > array[j]) {
                    min_index = j;
                }
            }
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
        //System.out.println(array[i]);
    }
}
