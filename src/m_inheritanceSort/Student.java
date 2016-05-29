package m_inheritanceSort;

/**
 * Created by andy on 5/2/16.
 */
public class Student {

    //默认以年龄为学生排序标准

    private int age;

    public Student(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "学生年龄：" + this.age;
    }
    public int getAge() {
        return this.age;
    }
}
