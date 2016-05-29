package m_inheritanceSort;

/**
 * Created by andy on 5/2/16.
 */
public class BubbleSort extends Sorter{
    public BubbleSort(Comparator comparator) {
        super(comparator);
    }
    public BubbleSort() {
        super();
    }

    @Override
    public void sort(boolean isAscend, Object[] array) {
        if(isAscend) {
            for(int i = 0; i < array.length - 1; i++) {
                for(int j = 0; j < array.length - i - 1; j++) {
                    if(comparator.compare(array[j], array[j + 1]) > 0)
                        swap(array, j, j + 1);
                }
            }
        } else {
            for(int i = 0; i < array.length - 1; i++) {
                for(int j = 0; j < array.length - i - 1; j++) {
                    if(comparator.compare(array[j], array[j + 1]) < 0)
                        swap(array, j, j + 1);
                }
            }
        }
    }

    private void swap(Object[] array, int j, int i) {
        Object temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
