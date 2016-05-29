package m_interfaceSort;

/**
 * Created by andy on 5/2/16.
 */
public class ShortComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Short t1 = (Short)o1;
        Short t2 = (Short)o2;
        return t1.compareTo(t2);
    }
}
