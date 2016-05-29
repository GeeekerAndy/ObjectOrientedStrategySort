package m_inheritanceSort;


/**
 * Created by andy on 5/2/16.
 */
public class StudentComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        Student t1 = (Student)o1;
        Student t2 = (Student)o2;
        if(t1.getAge() > t2.getAge()) {
            return 1;
        } else if(t1.getAge() == t2.getAge()){
            return 0;
        } else {
            return -1;
        }
    }
}
