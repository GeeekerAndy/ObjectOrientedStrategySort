package m_inheritanceSort;

/**
 * Created by andy on 5/2/16.
 */
public class IntComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer t1 = (Integer)o1;
        Integer t2 = (Integer)o2;
        return t1.compareTo(t2);
    }
}
