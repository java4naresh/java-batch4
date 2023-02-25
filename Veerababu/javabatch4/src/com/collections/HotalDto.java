package com.collections;

import java.util.List;

public class HotalDto implements Comparable<HotalDto> {
	
	private int HotalId;
	private String HotalName;
	private List<HotalMenu> menu;
	
	
	public int getHotalId() {
		return HotalId;
	}
	public void setHotalId(int hotalId) {
		HotalId = hotalId;
	}
	public String getHotalName() {
		return HotalName;
	}
	public void setHotalName(String hotalName) {
		HotalName = hotalName;
	}
	public List<HotalMenu> getMenu() {
		return menu;
	}
	public void setMenu(List<HotalMenu> menu) {
		this.menu = menu;
	}
	@Override
	public int hashCode() {
		
		return HotalId ;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotalDto other = (HotalDto) obj;
		if (HotalId != other.HotalId)
			return false;
		if (HotalName == null) {
			if (other.HotalName != null)
				return false;
		} else if (!HotalName.equals(other.HotalName))
			return false;
		if (menu == null) {
			if (other.menu != null)
				return false;
		} else if (!menu.equals(other.menu))
			return false;
		return true;
	}
	public HotalDto(int hotalId, String hotalName, List<HotalMenu> menu) {
		super();
		HotalId = hotalId;
		HotalName = hotalName;
		this.menu = menu;
	}
	public HotalDto() {
		super();
		
	}
	@Override
	public String toString() {
		return "HotalDto [HotalId=" + HotalId + ", HotalName=" + HotalName + ", menu=" + menu + "]";
	}
	
	

}
