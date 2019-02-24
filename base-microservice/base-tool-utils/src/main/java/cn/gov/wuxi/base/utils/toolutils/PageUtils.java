package cn.gov.wuxi.base.utils.toolutils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Author:王春伟
 * Date:2019/2/22
 **/
public class PageUtils {

    public static List<Map<String, Object>> excutePage(List<Map<String, Object>> list, Map<String, Object> reqMap){

        //执行分页,若分页参数没传,则默认currentPage=1,pageSize=10
        Long currentPage = 1L;
        Long pageSize =10L;
        if (reqMap.containsKey("currentPage") && reqMap.get("currentPage").toString() != null && !"".equals(reqMap.get("currentPage").toString().trim())) {
            currentPage = Long.valueOf(reqMap.get("currentPage").toString());
        }
        if (reqMap.containsKey("pageSize") && reqMap.get("pageSize").toString() != null && !"".equals(reqMap.get("pageSize").toString().trim())) {
            pageSize = Long.valueOf(reqMap.get("pageSize").toString());
        }
        //执行分页逻辑
        List<Map<String, Object>> resultList = list.stream().skip((currentPage-1L)*pageSize).limit(pageSize).collect(Collectors.toCollection(ArrayList:: new));
        //返回结果
        return resultList;

    }
}
