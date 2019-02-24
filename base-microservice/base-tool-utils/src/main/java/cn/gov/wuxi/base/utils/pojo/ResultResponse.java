package cn.gov.wuxi.base.utils.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * Author:王春伟
 * Date:2019/2/22
 * 全局统一返回结果类
 **/
@Data
@AllArgsConstructor
public class ResultResponse {
    //http状态码
    private int code;
    //返回结果的描述信息
    private String msg;
    //返回的数据
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Object data;

}
