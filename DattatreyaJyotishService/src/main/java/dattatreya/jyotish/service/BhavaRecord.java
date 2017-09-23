package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BhavaRecord {
	
	String bhavaName;
	
	String rashiName;
	
	@JsonProperty("grahas")
	List<String> grahas;
	

	public String getBhavaName() {
		return bhavaName;
	}

	public void setBhavaName(String bhavaName) {
		this.bhavaName = bhavaName;
	}

	public String getRashiName() {
		return rashiName;
	}

	public void setRashiName(String rashiName) {
		this.rashiName = rashiName;
	}

	
	public List<String> getGrahas() {
		return grahas;
	}

	public void setGrahas(List<String> grahas) {
		this.grahas = grahas;
	}
	
	
	

}
