package facadePattern;

public class App {
    public static void main(String[] args) {
        SortingManager manager = new SortingManager();

        manager.doBubbleSort();
        manager.doMergeSort();
        manager.doInsertionSort();
    }
}
