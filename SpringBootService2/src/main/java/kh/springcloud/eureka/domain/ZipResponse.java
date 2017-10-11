package kh.springcloud.eureka.domain;

public class ZipResponse {

	private boolean zipValid;

	public ZipResponse(boolean valid){
		this.zipValid = valid;
	}
	
	public boolean getZipValid() {
		return zipValid;
	}

	public void setZipValid(boolean zipValid) {
		this.zipValid = zipValid;
	}
	
	
}
