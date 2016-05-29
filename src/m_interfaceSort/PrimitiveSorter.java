package m_interfaceSort;

/**
 * Created by andy on 5/6/16.
 */
public class PrimitiveSorter<T> {
    public void sort(T[] array, Comparator comparator, SortAlgorithm algorithm) {
        switch(algorithm) {
            case BUBBLE:
                bubbleSort(array, comparator);
                break;
            case QUICK:
                quickSort(array, 0, array.length - 1, comparator);
                break;
            case INSERT:
                InsertionSort(array, comparator);
                break;
        }
    }

    private void bubbleSort(T[] array, Comparator comparator) {
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length-i-1;j++)
            {
                if(comparator.compare(array[j], array[j+1])>0)
                {
                    swap(array,j, j+1);
                }
            }
        }
    }
    private void quickSort(T[] array, int low, int high, Comparator comparator) {
        int k;
        if(low < high) {
            k = split(array, low, high, comparator);
            quickSort(array, low, k - 1, comparator);
            quickSort(array, k + 1, high, comparator);
        }
    }
    private int split(T[] array, int low, int high, Comparator comparator) {
        int i = low;
        int k;
        T temp = array[low];
        for(k = low + 1; k <= high; k++) {
            if(comparator.compare(array[k], temp) <= 0) {
                i++;
                if(i != k)
                    swap(array, i, k);
            }
        }
        swap(array, i, low);
        return i;
    }

    private void InsertionSort(T[] array, Comparator comparator) {
        for(int i = 0; i < array.length - 1; i++) {
            int j;
            T temp = array[i + 1];
            for(j = i; j >= 0 && comparator.compare(array[j], temp) > 0; j--) {
                swap(array, j, j + 1);
            }
            array[j + 1] = temp;
        }
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
