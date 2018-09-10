package com.imooc.sell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.enums.ResultEnum;
import com.imooc.sell.exception.SellException;
import com.imooc.sell.service.OrderService;

@Controller
@RequestMapping("/pay")
public class PayController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/create")
	public void create(@RequestParam("orderId")String orderId,
						@RequestParam("returnUrl")String returnUrl)
	{
		//1.查询订单
		OrderDTO orderDTO = orderService.findOne(orderId);
		if(null == orderDTO)
		{
			throw new SellException(ResultEnum.ORDER_NOT_EXIST);
		}
		
		//发起支付
		
		
	}
}
