public class SelectionSort {
    private int[] listToSort;

    SelectionSort(int[] listToSort) {
        this.listToSort = listToSort;
    }

    public void sortList() {
        int startingIndex = 0;
        int minimumIndex = 0;

        for(int i = 0; i < listToSort.length; i++) {
            for(int j = startingIndex; j < listToSort.length; j++) {
                if(listToSort[j] < listToSort[minimumIndex]) {
                    minimumIndex = j;
                }
            }

            int swap = listToSort[startingIndex];
            listToSort[startingIndex] = listToSort[minimumIndex];
            listToSort[minimumIndex] = swap;

            startingIndex++;
            minimumIndex = startingIndex;
        }
    }

    public void printSortedList() {
        for(int i = 0; i < listToSort.length; i++) {
            System.out.println(listToSort[i]);
        }
    }
}
