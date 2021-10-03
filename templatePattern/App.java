package templatePattern;

public class App {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 4, -2, -7, -9, 10, 12};
        Algorithm sorting = new SelectionSort(nums);
        sorting.sort();
    }
}
