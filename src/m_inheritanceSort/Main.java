package m_inheritanceSort;
import java.util.Random;

/**
 * Created by andy on 5/2/16.
 * 实验二排序的实现方案一
 * 继承实现
 */
public class Main {
    public static void main(String[] args) {

        //Initialize the original dataArray;
        int[] intArray = {23, 45, 76, 33, 76, 243, 87, 4, 43, 0, 9};
        String[] stringArray = {"哈哈哈", "啊", "fjdksol", "djdfoi", "jdikofw", "中文", "汉字"};
        Student[] studentsArray = new Student[10];
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            studentsArray[i] = new Student(random.nextInt(10) + 18);
        }

          //BubbleSort

//        //Test intArray by BubbleSort
//        new BubbleSort().sortIntArray(intArray, true);
//        new BubbleSort().printIntArray(intArray);
//        //Test stringArray by BubbleSort
//        new BubbleSort().sortStringArray(stringArray, true);
//        new BubbleSort().printStringArray(stringArray);
//        //Test objectArray by BubbleSort
//        new BubbleSort().sortStudentArray(studentsArray, true);
//        new BubbleSort().printObjectArray(studentsArray);

        //InsertionSort

//        //Test intArray by InsertionSort
//        new InsertionSort().sortIntArray(intArray, true);
//        new InsertionSort().printIntArray(intArray);
//        //Test stringArray by InsertionSort
//        new InsertionSort().sortStringArray(stringArray, true);
//        new InsertionSort().printStringArray(stringArray);
//        //Test studentArray by InsertionSort
//        new InsertionSort().sortStudentArray(studentsArray, true);
//        new InsertionSort().printObjectArray(studentsArray);

        //QuickSort
        //Test intArray by InsertSort
        new QuickSort().sortIntArray(intArray, true);
        new QuickSort().printIntArray(intArray);
        //Test stringArray by QuickSort
        new QuickSort().sortStringArray(stringArray, true);
        new QuickSort().printStringArray(stringArray);
        //Test studentArray by QuickSort
        new QuickSort().sortStudentArray(studentsArray,true);
        new QuickSort().printObjectArray(studentsArray);
    }



}
