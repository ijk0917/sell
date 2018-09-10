package com.imooc.sell.VO;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
/*
 * 商品（包含类目）
 * 
 * */
@Data
public class ProductVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1619866944061488544L;

	@JsonProperty("name")
	private String categoryName;
	
	@JsonProperty("type")
	private Integer categoryType;
	
	@JsonProperty("foods")
	private List<ProductInfoVO> productInfoVOs;
}
