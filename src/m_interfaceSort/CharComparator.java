package m_interfaceSort;

/**
 * Created by andy on 5/2/16.
 */
public class CharComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Character t1 = (Character)o1;
        Character t2 = (Character)o2;
        return t1.compareTo(t2);
    }
}
