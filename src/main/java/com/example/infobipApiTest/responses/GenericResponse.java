package com.example.infobipApiTest.responses;

public class GenericResponse {

	public String code;
	public String message;
	public Object data;

	public GenericResponse() {
	}
	
	public GenericResponse(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public GenericResponse(String code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
