package m_inheritanceSort;

/**
 * Created by andy on 5/2/16.
 */
public class FloatComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Float f1 = (Float)o1;
        Float f2 = (Float)o2;
        return f1.compareTo(f2);
    }
}
