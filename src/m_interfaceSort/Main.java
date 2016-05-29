package m_interfaceSort;

import java.util.Random;

/**
 * Created by andy on 5/6/16.
 * 实验二排序的实现方案二
 * 枚举实现
 */
public class Main {
    public static void main(String[] args) {

        //Initialize intArray
        int[] intArray = {23, 45, 76, 33, 76, 243, 87, 4, 43, 0, 9};
        //Initialize stringArray
        String[] stringArray = {"哈哈哈", "啊", "fjdksol", "djdfoi", "jdikofw", "中文", "汉字"};
        //Initialize objectArray
        Student[] studentsArray = new Student[10];
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            studentsArray[i] = new Student(random.nextInt(10) + 18);
        }

        //Test intArray
        Sorter.sortIntArray(intArray);
        Sorter.printIntArray(intArray);

        //Test stringArray
        Sorter.sortStringArray(stringArray);
        Sorter.printStringArray(stringArray);

        //Test objectArray
        Sorter.sortStudentArray(studentsArray);
        Sorter.printObjectArray(studentsArray);


    }
}
