package m_inheritanceSort;

/**
 * Created by andy on 5/2/16.
 */
public class LongComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Long t1 = (Long)o1;
        Long t2 = (Long)o2;
        return t1.compareTo(t2);
    }
}
