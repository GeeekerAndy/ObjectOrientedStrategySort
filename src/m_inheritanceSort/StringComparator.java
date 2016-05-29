package m_inheritanceSort;

/**
 * Created by andy on 5/2/16.
 */
public class StringComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String str1 = (String)o1;
        String str2 = (String)o2;
        try {
            String str3 = new String(o1.toString().getBytes("GB2312"), "ISO-8859-1");
            String str4 = new String(o2.toString().getBytes("GB2312"), "ISO-8859-1");
            return str3.compareTo(str4);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return str1.compareTo(str2);
    }
}
