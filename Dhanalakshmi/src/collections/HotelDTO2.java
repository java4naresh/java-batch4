package collection;

import java.util.Objects;

public class HotelDTO2 implements Comparable<HotelDTO2> {
	
	private String hotelName;

	public HotelDTO2(String hotelName) {
		super();
		this.hotelName = hotelName;
	}

	public String getHotelName() {
		return hotelName;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(hotelName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelDTO2 other = (HotelDTO2) obj;
		return Objects.equals(hotelName, other.hotelName);
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	@Override
	public String toString() {
		return "HotelDTO2 [hotelName=" + hotelName + "]";
	}

	@Override
	public int compareTo(HotelDTO2 o) {
		
		return this.hotelName.compareTo(o.getHotelName());
	}

}
