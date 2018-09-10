package com.imooc.sell.serviceImpl;

import org.springframework.stereotype.Service;

import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.service.PayService;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;

@Service
public class PayServiceImpl implements PayService{

	@Override
	public void create(OrderDTO orderDTO) {
		BestPayServiceImpl bestPayService = new BestPayServiceImpl();
		//bestPayService
		
	}

}
