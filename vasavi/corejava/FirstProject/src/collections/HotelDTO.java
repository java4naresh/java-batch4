package collections;

import java.util.Objects;

public class HotelDTO implements Comparable<HotelDTO>{
	
	private int hotelId;
	
	private String hotelName;

	public HotelDTO(int hotelId, String hotelName) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
	}
	
	public HotelDTO() {
		super();
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(hotelId, hotelName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelDTO other = (HotelDTO) obj;
		return hotelId == other.hotelId && Objects.equals(hotelName, other.hotelName);
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	@Override
	public String toString() {
		return "HotelDTO [hotelId=" + hotelId + ", hotelName=" + hotelName + "]";
	}

	@Override
	public int compareTo(HotelDTO o) {
		
		return this.hotelName.compareTo(o.getHotelName());
	}




}
