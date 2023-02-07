package collection;

public class HotelDTO implements Comparable<HotelDTO>{
	
	private int hotelId;
	
	private String hotelName;
	
	

	public HotelDTO(int hotelId, String hotelName) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
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
		if (hotelId != other.hotelId)
			return false;
		if (hotelName == null) {
			if (other.hotelName != null)
				return false;
		} else if (!hotelName.equals(other.hotelName))
			return false;
		return true;
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

	@Override
	public String toString() {
		return "HotelDTO [hotelId=" + hotelId + ", hotelName=" + hotelName + "]";
	}

	@Override
	public int compareTo(HotelDTO o) {
		
		return this.hotelName.compareTo(o.getHotelName());
	}
	
	
	

}
