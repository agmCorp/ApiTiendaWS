package uy.com.bse.util.recaptcha;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class RecaptchaResponse implements Serializable {
	private static final long serialVersionUID = 9213503267021243663L;
	
	private boolean success;
	private String challenge_ts;
	private String hostname;
	@XmlElement(name="error-codes")
	private List<String> errorCodes;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getChallenge_ts() {
		return challenge_ts;
	}

	public void setChallenge_ts(String challenge_ts) {
		this.challenge_ts = challenge_ts;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public List<String> getErrorCodes() {
		return errorCodes;
	}

	public void setErrorCodes(List<String> errorCodes) {
		this.errorCodes = errorCodes;
	}
}
