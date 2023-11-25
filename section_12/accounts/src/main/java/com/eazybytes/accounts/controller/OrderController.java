package com.eazybytes.accounts.controller;

import com.eazybytes.accounts.dto.OrderDto;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

	private List<OrderDto> orders;

	@RequestMapping(value ="/getorder?oid=${orderId}")
	public ResponseEntity<OrderDto>    getOrderDetails(@RequestParam int orderId){
		//    logic
		                      OrderDto order = new OrderDto();
		               return ResponseEntity.status(200).body(order);
	}

	@RequestMapping(value ="/getorders")
	public ResponseEntity<List<OrderDto>>    getOrderList(@RequestBody int[] orderIds){
		//    logic
		List<OrderDto> orders = new ArrayList<OrderDto>();
		return ResponseEntity.status(200).body(orders);
	}
}
