package facadePattern;

public class SortingManager {
    private Algorithm bubbleSort;
    private Algorithm mergeSort;
    private Algorithm insertionSort;

    public SortingManager() {
        this.bubbleSort = new BubbleSort();
        this.mergeSort = new MergeSort();
        this.insertionSort = new InsertionSort();
    }

    public void doBubbleSort() {
        this.bubbleSort.sort();
    }

    public void doMergeSort() {
        this.mergeSort.sort();
    }

    public void doInsertionSort() {
        this.insertionSort.sort();
    }
}
