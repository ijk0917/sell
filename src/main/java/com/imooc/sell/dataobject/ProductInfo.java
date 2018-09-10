package com.imooc.sell.dataobject;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.imooc.sell.enums.ProductStatusEnum;
import com.imooc.sell.utils.EnumUtil;

import lombok.Data;

@Entity
@Data
@DynamicUpdate
@DynamicInsert
public class ProductInfo {
	/*Id*/
	@Id
	private String productId;
	
	/*名字*/
	private String productName;
	
	/*单价*/
	private BigDecimal productPrice;
	
	/*库存*/
	private Integer productStock;
	
	/*描述*/
	private String productDescription;
	
	/*小图*/
	private String productIcon;
	
	/*状态，0正常1下架*/
	private Integer productStatus = ProductStatusEnum.UP.getCode();
	
	/*类目编号*/
	private Integer categoryType;
	
	/*创建时间*/
	private Date createTime;
	
	/*更新时间*/
	private Date updateTime;
	
	@JsonIgnore
	public ProductStatusEnum getProductStatusEnum()
	{
		return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
	}
}
