package uy.com.bse.util.recaptcha;

public class RecaptchaConfig {
	private String serviceUrl;
	private String secretKey;
	private Boolean proxyEnabled;
	private String proxyHost;
	private String proxyPort;

	public String getServiceUrl() {
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public Boolean getProxyEnabled() {
		return proxyEnabled;
	}

	public void setProxyEnabled(Boolean proxyEnabled) {
		this.proxyEnabled = proxyEnabled;
	}

	public String getProxyHost() {
		return proxyHost;
	}

	public void setProxyHost(String proxyHost) {
		this.proxyHost = proxyHost;
	}

	public String getProxyPort() {
		return proxyPort;
	}

	public void setProxyPort(String proxyPort) {
		this.proxyPort = proxyPort;
	}
}
