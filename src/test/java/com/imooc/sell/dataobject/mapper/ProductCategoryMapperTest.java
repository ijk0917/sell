package com.imooc.sell.dataobject.mapper;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.imooc.sell.Application;
import com.imooc.sell.dataobject.ProductCategory;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Slf4j
public class ProductCategoryMapperTest {

	@Autowired
	private ProductCategoryMapper

	productCategoryMapper;

	@Test
	public void testInsertByMap() {
		Map<String, Object> map = new HashMap<>();
		map.put("category_name", "师兄最不爱");
		map.put("category_type", 101);
		int result =

				productCategoryMapper.insertByMap(map);
		Assert.assertEquals(1, result);
	}

	@Test
	public void testInsertByObject() {
		ProductCategory productCategory = new

		ProductCategory();
		productCategory.setCategoryName("师兄最不爱");
		productCategory.setCategoryType(102);
		int result =

				productCategoryMapper.insertByObject(productCategory);
		Assert.assertEquals(1, result);

	}

	@Test
	public void testFindByCategoryType() {
		ProductCategory productCategory =

				productCategoryMapper.findByCategoryType(102);
		Assert.assertNotNull(productCategory);
		System.out.println(productCategory);
	}

	@Test
	public void testUpdateByCategoryType() {
		int result =productCategoryMapper.updateByCategoryType("师兄最不爱的",102);
		Assert.assertEquals(1, result);
	}

	@Test
	public void testSelectByCategoryType() {
		ProductCategory productCategory =

				productCategoryMapper.selectByCategoryType(101);
		Assert.assertNotNull(productCategory);
	}
}
