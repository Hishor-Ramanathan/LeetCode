package algorithms.search;

public class Search {
    public boolean binarySearch(int[] array, int number) {
        int high = array.length;
        int low = 0;
        do {
            int middle = low + (high - low) / 2;
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

    /*
    Given two crystal ball that will break if dropped from a high enough distance,
    determine the exact spot in which it will break in the most  optimized way.
     */
    public int twoCrystalBall(boolean[] floors) {
        int jmpAmount = Float.floatToIntBits(Math.round(Math.sqrt(floors.length)));
        int i = 0;
        for (; i < floors.length; i += jmpAmount) {
            if (floors[i]) {
                break;
            }
        }

        i -= jmpAmount;

        for (int j = i; j < floors.length; j++) {
            if (floors[j]) {
                return j + 1;
            }
        }
        return -1;
    }
}
