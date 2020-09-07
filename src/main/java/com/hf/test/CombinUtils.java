package com.hf.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合元素组合工具类
 */
public class CombinUtils {

    /**
     * 若干个集合元素的组合
     * @param dataList 多个集合
     * @return 组合结果
     */
    public static List<String> combin(List<List<String>> dataList){
        List<String> combine = dataList.get(0);
        for (int i = 1; i < dataList.size(); i++) {
            combine = cartesianProduct(combine, dataList.get(i));
        }
        return combine;
    }

    /**
     * 两个集合元素的组合
     * @param c1 集合1
     * @param c2 集合2
     * @return 组合结果
     */
    private static List<String> cartesianProduct(List<String> c1, List<String> c2) {
        List<String> combine = new ArrayList<String>();
        for (String s : c1) {
            for (String t : c2) {
                combine.add(String.format("%s%s", s, t));
            }
        }
        return combine;
    }

}
