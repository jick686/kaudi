package 排序demo;

import 去重demo.RobotCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @program: kaudi
 * @description: 排序
 * @author: wjz
 * @create: 2020-07-17 10:19
 **/
public class Demo1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(12, "zhangsan"));
        students.add(new Student(13, "zhangsan1"));
        students.add(new Student(12, "zhangsan2"));
        students.add(new Student(10, "zhangsan3"));
        students.add(new Student(6, "zhangsan4"));
        List<Student> sort = sort(students);
        System.out.println(sort);

    }

    public static List<Student> sort(List<Student> students){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student  o1, Student  o2) {
                //按照学生的年龄进行升序排列 ;<是降序
//                if(o1.getAge() > o2.getAge()){
//                    return 1;
//                }
//                if(o1.getAge() == o2.getAge()){
//                    return 0;
//                }
//                return -1;

                return o1.getAge()-o2.getAge();//升序
//                return o2.getAge()-o1.getAge();//降序
//                return o1.getName().compareTo(o2.getName()) ;// 按照姓名升序
//                return o2.getName().compareTo(o1.getName()) ;// 按照姓名降序
            }
        });
        return students;
    }

}
