package collections;

import java.util.Objects;

public class HotelDTO implements Comparable<HotelDTO>{
	
	private int hotelId;
	
	private String hotelName;
	
	private int rating;
	
	
	
	
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
		return hotelId == other.hotelId && Objects.equals(hotelName, other.hotelName) && rating == other.rating;
	}


	public HotelDTO(int hotelId, String hotelName, int rating) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.rating = rating;
	}

	
	public HotelDTO() {
		super();
		
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


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}
	
	


	@Override
	public String toString() {
		return "HotelDTO [hotelId=" + hotelId + ", hotelName=" + hotelName + ", rating=" + rating + "]";
	}


	@Override
	public int compareTo(HotelDTO o) {
		
		return this.hotelName.compareTo(o.getHotelName());
	}

}
