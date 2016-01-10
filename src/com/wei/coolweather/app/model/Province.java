package com.wei.coolweather.app.model;
/**
 * 省级实体
 * @author Province
 *<p>Descrl</P>
 * @date 2016-1-4 下午9:52:34
 *
 */
public class Province {

	private int id;
	private String provinceName;
	private String provinceCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	
}
