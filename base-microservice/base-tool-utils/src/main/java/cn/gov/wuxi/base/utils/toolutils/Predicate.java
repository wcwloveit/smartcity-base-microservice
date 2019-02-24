package cn.gov.wuxi.base.utils.toolutils;

import cn.gov.wuxi.base.utils.constant.ResultCode;
import cn.gov.wuxi.base.utils.exception.MyException;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import java.util.List;

/**
 * Author:王春伟
 * Date:2019/2/22
 **/
public class  Predicate {

    Assert anAssert = null;
    //判断参数是否合法
    public static void isIllegalState(boolean expression, String message) throws MyException {
        if (!expression) {
            throw new MyException(ResultCode.PARAMS_NOT_ILLEGAL, message);
        }
    }
    //断言参数为空
    public static void isNull(Object object, String message) throws MyException {
        if (object != null) {
            throw new MyException(ResultCode.PARAMS_NOT_NULL, message);
        }
    }
    //断言参数不为空
    public static void notNull(Object object, String message) throws MyException {
        if (object == null) {
            throw new MyException(ResultCode.PARAMS_IS_NULL, message);
        }
    }
    //断言数组不为空
    public static void notEmpty(Object[] array, String message) throws MyException {
        if (ObjectUtils.isEmpty(array)) {
            throw new MyException(ResultCode.PARAMS_IS_NULL, message);
        }
    }
    //断言数组为空
    public static void isEmpty(Object[] array, String message) throws MyException {
        if (!ObjectUtils.isEmpty(array)) {
            throw new MyException(ResultCode.PARAMS_NOT_NULL, message);
        }
    }
    //断言集合不为空
    public static void notEmpty(List<Object> list, String message) throws MyException {
        if (ObjectUtils.isEmpty(list)) {
            throw new MyException(ResultCode.PARAMS_IS_NULL, message);
        }
    }
    //断言集合为空
    public static void isEmpty(List<Object> list, String message) throws MyException {
        if (!ObjectUtils.isEmpty(list)) {
            throw new MyException(ResultCode.PARAMS_NOT_NULL, message);
        }
    }

}
