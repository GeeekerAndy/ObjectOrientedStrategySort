package m_inheritanceSort;


/**
 * Created by andy on 5/2/16.
 */

//抽象Sorter类，所有的排序策略都继承自它
public abstract class Sorter {

    protected Comparator comparator;

    protected Sorter() {

    }

    protected Sorter(Comparator comparator) {
        this.comparator = comparator;
    }

    protected void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }
    
    protected abstract void sort(boolean isAscend, Object[] array);
    
    final void sort(Object[] array) {
        sort(true, array);  //默认是按照升序排序
    }
    
    final void sortIntArray(int[] array, boolean isAscend) {
        Integer[] integers = new Integer[array.length];
        for(int i = 0; i < array.length; i++)
            integers[i] = array[i];
        this.setComparator(new IntComparator());
        this.sort(isAscend, integers);
        for(int j = 0; j < integers.length; j++)
            array[j] = integers[j];
    }
    final void sortDoubleArray(double[] array,boolean isAscend) {
        Double[] integers = new Double[array.length];
        for(int i = 0;i<array.length;i++)
            integers[i]=array[i];
        this.setComparator(new DoubleComparator());
        this.sort(isAscend, integers);
        for(int j = 0;j<integers.length;j++)
            array[j]=integers[j];
    }
    final void sortFloatArray(float[] array,boolean isAscend) {
        Float[] integers = new Float[array.length];
        for(int i = 0;i<array.length;i++)
            integers[i]=array[i];
        this.setComparator(new FloatComparator());
        this.sort(isAscend, integers);
        for(int j = 0;j<integers.length;j++)
            array[j]=integers[j];
    }
    final void sortByteArray(byte[] array,boolean isAscend) {
        Byte[] integers = new Byte[array.length];
        for(int i = 0;i<array.length;i++)
            integers[i]=array[i];
        this.setComparator(new ByteComparator());
        this.sort(isAscend, integers);
        for(int j = 0;j<integers.length;j++)
            array[j]=integers[j];
    }
    final void sortShortArray(short[] array,boolean isAscend) {
        Short[] integers = new Short[array.length];
        for(int i = 0;i<array.length;i++)
            integers[i]=array[i];
        this.setComparator(new ShortComparator());
        this.sort(isAscend, integers);
        for(int j = 0;j<integers.length;j++)
            array[j]=integers[j];
    }
    final void sortCharArray(char[] array,boolean isAscend) {
        Character[] integers = new Character[array.length];
        for(int i = 0;i<array.length;i++)
            integers[i]=array[i];
        this.setComparator(new CharComparator());
        this.sort(isAscend, integers);
        for(int j = 0;j<integers.length;j++)
            array[j]=integers[j];
    }
    final void sortLongArray(long[] array,boolean isAscend) {
        Long[] integers = new Long[array.length];
        for(int i = 0;i<array.length;i++)
            integers[i]=array[i];
        this.setComparator(new LongComparator());
        this.sort(isAscend, integers);
        for(int j = 0;j<integers.length;j++)
            array[j]=integers[j];
    }
    final void sortStringArray(String[] array, boolean isAscend) {
        this.setComparator(new StringComparator());
        this.sort(isAscend, array);
    }
    final void sortStudentArray(Student[] array, boolean isAscend) {
        this.setComparator(new StudentComparator());
        this.sort(isAscend, array);
    }

    final void printByteArray(byte[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    final void printCharArray(char[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    final void printDoubleArray(double[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    final void printFloatArray(Float[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    final void printIntArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    final void printLongArray(long[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    final void printShortArray(short[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    final void printStringArray(String[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    final void printObjectArray(Object[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

}

















