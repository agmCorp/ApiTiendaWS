package uy.com.bse.dto.mibse;

import java.io.Serializable;

public class FileUploadDTO implements Serializable {
	private static final long serialVersionUID = 2888774633375974256L;

	private String filename;
	private String mimetype;
	private Integer size;

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getMimetype() {
		return mimetype;
	}

	public void setMimetype(String mimetype) {
		this.mimetype = mimetype;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}
}
