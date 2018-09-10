package com.imooc.sell.VO;

import java.io.Serializable;

import lombok.Data;

@Data
public class ResultVO<T> implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8060939821558190294L;

	/*错误码*/
	private Integer code;
	
	/*提示信息*/
	private String msg;
	
	/*数据*/
	private T data;
}
