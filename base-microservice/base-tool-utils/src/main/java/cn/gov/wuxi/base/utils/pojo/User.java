package cn.gov.wuxi.base.utils.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)//链式调用
@AllArgsConstructor
public class User implements Serializable{

	private static final long serialVersionUID = 1372576143038634509L;
	//用户名
	private String userName;
	//密码
	private String password;

}
