package m_inheritanceSort;

/**
 * Created by andy on 5/2/16.
 */
public class DoubleComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Double t1 = (Double)o1;
        Double t2 = (Double)o2;
        return t1.compareTo(t2);
    }
}
