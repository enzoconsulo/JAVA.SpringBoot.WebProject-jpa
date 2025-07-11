package com.enzoccs.SpringBootWebProject.entities.enums;


public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private Integer code;
	
	private OrderStatus(Integer code) {
		this.code = code;
	}
	
	public Integer getCode() {
		return code;
	}
	
	public static OrderStatus value(int code) {
		for(OrderStatus OS : OrderStatus.values()) {
			if(code == OS.getCode()) {
				return OS;
			}
		}
		throw new IllegalArgumentException("invalid OrderStatus code");
	}

}
