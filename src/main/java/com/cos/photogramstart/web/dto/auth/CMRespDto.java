package com.cos.photogramstart.web.dto.auth;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CMRespDto<T> {
	
	private int code;
	private String message;
	private T data;
	
}
