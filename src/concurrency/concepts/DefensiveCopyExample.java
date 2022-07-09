package core.java.concurrency.concepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DefensiveCopyExample {

    Map<Integer, String> studentMap = new HashMap<>();
    Map<Integer, String> constStudentMap = Collections.unmodifiableMap(studentMap);

    public DefensiveCopyExample(Map<Integer, String> map) {
        studentMap = new HashMap<>(map);
    }

    public Map<Integer, String> getStudentMap() {
        return constStudentMap;
    }

    @Override
    public String toString() {
        return "DefensiveCopyExample{" +
                "studentMap=" + studentMap +
                '}';
    }

    public static void main(String[] args) {

        Map<Integer, String> input = new HashMap<>();
        input.put(01, "Mathankumar");

        DefensiveCopyExample dce = new DefensiveCopyExample(input);
        System.out.println(dce);

        Map<Integer, String> mapFromDce = dce.getStudentMap();
//        java.lang.UnsupportedOperationException
//        mapFromDce.put(02,"Student2");
        System.out.println(dce);
    }
}
