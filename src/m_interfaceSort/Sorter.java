package m_interfaceSort;


/**
 * Created by andy on 5/6/16.
 */
public class Sorter {
    
    public static void sortIntArray(int[] array, boolean isAscend, SortAlgorithm algorithm) {
        Integer[] integers = new Integer[array.length];
        for(int i = 0; i < array.length; i++) {
            integers[i] = array[i];
        }
        new TypeSorter<>().sortArray(integers, isAscend, algorithm, new IntComparator());
        for(int j = 0; j < integers.length; j++) {
            array[j] = integers[j];
        }        
    }
    public static void sortFloatArray(float[] array,boolean isAscend,SortAlgorithm algorithm) {
        Float[] floats = new Float[array.length];
        for(int i = 0;i<array.length;i++)
            floats[i]=array[i];
        new TypeSorter().sortArray(floats, isAscend, algorithm,new FloatComparator());
        for(int j = 0;j<floats.length;j++)
            array[j]=floats[j];
    }
    public static void sortCharArray(char[] array,boolean isAscend,SortAlgorithm algorithm) {
        Character[] characters = new Character[array.length];
        for(int i = 0;i<array.length;i++)
            characters[i]=array[i];
        new TypeSorter().sortArray(characters, isAscend, algorithm,new CharComparator());
        for(int j = 0;j<characters.length;j++)
            array[j]=characters[j];
    }
    public static void sortShortArray(short[] array,boolean isAscend,SortAlgorithm algorithm) {
        Short[] shorts = new Short[array.length];
        for(int i = 0;i<array.length;i++)
            shorts[i]=array[i];
        new TypeSorter().sortArray(shorts, isAscend, algorithm,new ShortComparator());
        for(int j = 0;j<shorts.length;j++)
            array[j]=shorts[j];
    }
    public static void sortDoubleArray(double[] array,boolean isAscend,SortAlgorithm algorithm) {
        Double[] doubles = new Double[array.length];
        for(int i = 0;i<array.length;i++)
            doubles[i]=array[i];
        new TypeSorter().sortArray(doubles, isAscend, algorithm,new DoubleComparator());
        for(int j = 0;j<doubles.length;j++)
            array[j]=doubles[j];
    }
    public static void sortByteArray(byte[] array,boolean isAscend,SortAlgorithm algorithm) {
        Byte[] bytes = new Byte[array.length];
        for(int i = 0;i<array.length;i++)
            bytes[i]=array[i];
        new TypeSorter().sortArray(bytes, isAscend, algorithm,new ByteComparator());
        for(int j = 0;j<bytes.length;j++)
            array[j]=bytes[j];
    }
    public static void sortLongArray(long[] array,boolean isAscend,SortAlgorithm algorithm) {
        Long[] longs = new Long[array.length];
        for(int i = 0;i<array.length;i++)
            longs[i]=array[i];
        new TypeSorter().sortArray(longs, isAscend, algorithm,new LongComparator());
        for(int j = 0;j<longs.length;j++)
            array[j]=longs[j];
    }
    
    public static void sortIntArray(int[] array) {
        Sorter.sortIntArray(array, true, SortAlgorithm.BUBBLE);
    }
    public static void sortFloatArray(float[] array)    
    {
        Sorter.sortFloatArray(array, true, SortAlgorithm.BUBBLE);
    }
    public static void sortCharArray(char[] array)
    {
        Sorter.sortCharArray(array, true, SortAlgorithm.BUBBLE);
    }
    public static void sortShortArray(short[] array)
    {
        Sorter.sortShortArray(array, true, SortAlgorithm.BUBBLE);
    }
    public static void sortDoubleArray(double[] array)
    {
        Sorter.sortDoubleArray(array, true, SortAlgorithm.BUBBLE);
    }
    public static void sortByteArray(byte[] array)
    {
        Sorter.sortByteArray(array, true, SortAlgorithm.BUBBLE);
    }
    public static void sortLongArray(long[] array)
    {
        Sorter.sortLongArray(array, true, SortAlgorithm.BUBBLE);
    }
    public static void sortStringArray(String[] array) {
        new TypeSorter<String>().sortArray(array, true, SortAlgorithm.INSERT, new StringComparator());
    }
    public static void sortStudentArray(Student[] array) {
        new TypeSorter<Student>().sortArray(array, true, SortAlgorithm.QUICK, new StudentComparator());
    }

    public static void printByteArray(byte[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    public static void printCharArray(char[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    public static void printDoubleArray(double[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    public static void printFloatArray(Float[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    public static void printIntArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    public static void printLongArray(long[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    public static void printShortArray(short[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    public static void printStringArray(String[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    public static void printObjectArray(Object[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
}
