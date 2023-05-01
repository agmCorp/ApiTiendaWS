package uy.com.bse.dto.common;

import java.io.Serializable;

public class CodigueraDTO implements Serializable {
	private static final long serialVersionUID = -6491436683707568228L;
	
	private Integer id;
	private String item;
	private String label;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
}
