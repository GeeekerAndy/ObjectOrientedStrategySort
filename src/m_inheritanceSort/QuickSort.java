package m_inheritanceSort;


/**
 * Created by andy on 5/2/16.
 */
public class QuickSort extends Sorter {

    public QuickSort() {
        super();
    }

    public QuickSort(Comparator comparator) {
        super(comparator);
    }

    @Override
    public void sort(boolean isAscend, Object[] array) {
        quickSort(array, 0, array.length -1, comparator);
        if(!isAscend) {
            Object[] objects = new Object[array.length];
            for(int i = 0; i < array.length; i++) {
                objects[i] = array[array.length - i - 1];
            }
            for(int j = 0; j < array.length; j++) {
                array[j] = objects[j];
            }
        }
    }

    private void quickSort(Object[] array, int low, int high, Comparator comparator) {
        int k;
        if(low < high) {
            k = split(array, low, high, comparator);
            quickSort(array, low, k - 1, comparator);
            quickSort(array, k + 1, high, comparator);
        }
    }

    private int split(Object[] array, int low, int high, Comparator comparator) {
        int k;
        int i = low;
        Object axis = array[low];
        for(k = low + 1; k <= high; k++) {
            if(comparator.compare(array[k], axis) <= 0) {
                i++;
                if(i != k)
                    swap(array, i, k);
            }
        }
        swap(array, low, i);
        return i;
    }

    private void swap(Object[] array, int i, int j) {
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
