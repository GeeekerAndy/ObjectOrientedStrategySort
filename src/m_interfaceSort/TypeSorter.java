package m_interfaceSort;


/**
 * Created by andy on 5/6/16.
 */
public class TypeSorter<T> {
    public void sortArray(T[] array, boolean isAscend, SortAlgorithm algorithm, Comparator comparator) {
        new PrimitiveSorter<T>().sort(array, comparator, algorithm);
        if(!isAscend) {
            T[] tempArray = (T[])new Object[array.length];
            for(int i = 0; i < array.length; i++) {
                tempArray[i] = array[array.length - i -1];
            }
            for(int i = 0; i < array.length; i++) {
                array[i] = tempArray[i];
            }
        }
    }
}
