package com.AIS.Dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDto {
	
	@NotNull(message = "상품 아이디는 필수 입력입니다.")
	private Long itemId;
	
	@Min(value = 1 , message ="최소 1마리 입니다.")
	@Max(value= 1 , message = "최대 1마리 입니다.")
	private int count;
}
