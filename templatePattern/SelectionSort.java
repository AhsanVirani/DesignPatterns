package templatePattern;

public class SelectionSort extends Algorithm {
    public SelectionSort(int[] nums) {
        super(nums);    
    }

    @Override
    protected void initialise() {
        System.out.println("Initialising the selection sort algorithm");
    }

    @Override
    protected void sorting() {
        for (int i = 0; i < nums.length-1; ++i) {
            int index = i;
            for (int j = i+1; j < nums.length; ++j) {
                if (nums[j] > nums[index])
                    index = j;
            if (index != i)
                swap(i, index);
            }
        }
    }

    @Override
    protected void showResult() {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }
}