package m_inheritanceSort;

/**
 * Created by andy on 5/2/16.
 */
public class ByteComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Byte t1 = (Byte)o1;
        Byte t2 = (Byte)o2;
        return t1.compareTo(t2);
    }
}
