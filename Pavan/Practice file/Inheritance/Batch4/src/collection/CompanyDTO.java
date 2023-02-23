package collection;

import java.util.List;
import java.util.Objects;

public class CompanyDTO {

	private int companyId;
	private String companyName;
	private List<EmpDetails> details;

	public CompanyDTO(int companyId, String companyName, List<EmpDetails> details) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.details = details;
	}

	public CompanyDTO() {
		super();
	}

	@Override
	public int hashCode() {
		return companyId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompanyDTO other = (CompanyDTO) obj;
		return companyId == other.companyId && Objects.equals(companyName, other.companyName)
				&& Objects.equals(details, other.details);
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<EmpDetails> getDetails() {
		return details;
	}

	public void setDetails(List<EmpDetails> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "CompanyDTO [companyId=" + companyId + ", companyName=" + companyName + ", details=" + details + "]";
	}

}
