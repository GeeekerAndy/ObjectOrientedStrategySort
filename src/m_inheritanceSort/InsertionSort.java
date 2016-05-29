package m_inheritanceSort;
/**
 * Created by andy on 5/2/16.
 */
public class InsertionSort extends Sorter{
    public InsertionSort(Comparator comparator) {
        super(comparator);
    }
    public InsertionSort() {
        super();
    }
    @Override
    public void sort(boolean isAscend, Object[] array) {
        int i, j;
        for(i = 1; i < array.length; i++) {
            Object temp = array[i];
            for(j = i - 1; j >= 0 && comparator.compare(temp, array[j]) < 0; j--) {
                    array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }

        if(!isAscend) {
            Object[] objects = new Object[array.length];
            for(i = 0; i < array.length; i++)
                objects[i] = array[array.length - i -1];
            for(j = 0; j < array.length; j++)
                array[j] = objects[j];
        }
    }
}
