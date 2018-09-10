package com.imooc.sell.dataobject;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;


/*
 * 类目
 */
@Entity
@DynamicUpdate/*动态更新*/
@Table(name = "product_category")
@Data
@DynamicInsert
public class ProductCategory {
	/* 类目id */
	@Id
	@GeneratedValue
	private Integer categoryId;
	
	/*类目名字*/
	private String categoryName;
	
	/*类目编号*/
	private Integer categoryType;
	
	/*创建时间*/
	private Date createTime;
	
	/*更新时间*/
	private Date updateTime;
	
	
	
	public ProductCategory()
	{}
	
	public ProductCategory(String categoryName,Integer categoryType)
	{
		this.categoryName=categoryName;
		this.categoryType=categoryType;
	}
}
