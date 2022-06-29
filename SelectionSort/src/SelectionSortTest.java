public class SelectionSortTest {
    public static void main(String[] args) {
        int[] listToBeSorted = {9, 10, 1, -32, 987, 184, 12, 0, 875, -1, 1, 186, 0};

        SelectionSort testSelectionSort = new SelectionSort(listToBeSorted);

        testSelectionSort.sortList();
        testSelectionSort.printSortedList();
    }
}
