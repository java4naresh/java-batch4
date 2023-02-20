package collections;

import java.util.Objects;

public class HotelDTO implements Comparable<HotelDTO>{
	
	private String hotelName;
	
	private int hotelId;
	
	private int hotelRating;

	public HotelDTO(int hotelId, String hotelName, int hotelRating) {
		super();
		this.hotelName = hotelName;
		this.hotelId = hotelId;
		this.hotelRating = hotelRating;
		
		
	}

	@Override
	public int hashCode() {
		return hotelId;
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
		return hotelId == other.hotelId && Objects.equals(hotelName, other.hotelName)
				&& hotelRating == other.hotelRating;
	}

	public HotelDTO() {
		super();
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public int getHotelRating() {
		return hotelRating;
	}

	public void setHotelRating(int hotelRating) {
		this.hotelRating = hotelRating;
	}

	@Override
	public String toString() {
		return "HotelDTO [hotelName=" + hotelName + ", hotelId=" + hotelId + ", hotelRating=" + hotelRating + "]";
	}

	@Override
	public int compareTo(HotelDTO o) {
		
		return this.hotelName.compareTo(o.getHotelName());
	}
	
	
	

}
