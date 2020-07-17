package 去重demo;

import java.util.*;

/**
 * @program: kaudi
 * @description: 测试去重
 * @author: wjz
 * @create: 2020-07-17 10:04
 **/
public class Demo {
    public static void main(String[] args) {
        List<RobotCase> cases = new ArrayList<>();
        RobotCase robotCase = new RobotCase(1L, 1L, "hah", "a", (byte) 1, "177");
        RobotCase robotCase1 = new RobotCase(1L, 1L, "hah", "a", (byte) 1, "177");
        RobotCase robotCase2 = new RobotCase(1L, 1L, "hah", "a", (byte) 1, "178");
        cases.add(robotCase);
        cases.add(robotCase1);
        cases.add(robotCase2);
        removeDuplicateCase(cases);
    }

    /**
     * 根据电话号码去重
     * @param cases
     * @return
     */
    private static List<RobotCase> removeDuplicateCase(List<RobotCase> cases) {
        Set<RobotCase> set = new TreeSet<>(new Comparator<RobotCase>() {
            @Override
            public int compare(RobotCase o1, RobotCase o2) {
                //字符串,则按照asicc码升序排列
                return o1.getBorrowerTel().compareTo(o2.getBorrowerTel());
            }
        });
        set.addAll(cases);
        System.out.println(set);
        return new ArrayList<>(set);
    }
}
