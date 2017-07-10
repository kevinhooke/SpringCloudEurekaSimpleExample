package kh.springcloud.eureka.domain;

public class ExampleResponse {

	private String msg;
	
	public ExampleResponse() {}
	
	public ExampleResponse(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
