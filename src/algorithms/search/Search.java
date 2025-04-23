package algorithms.search;

public class Search {
    public boolean binarySearch(int[] array, int number) {
        int high = array.length;
        int low = 0;
        do {
            int middle = low + (high-low)/2;
            if (array[middle] == number) {
                return true;
            }
            if (array[middle] < number) {
                low = middle + 1;
            }
            if (array[middle] > number) {
                high = middle - 1;
            }

        } while (low <= high);
        return false;
    }
}
