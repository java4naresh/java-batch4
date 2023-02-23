package collections;

public class MenuDTO {
	
	private String itemName;
	
	private Integer itemCost;
	
	private Integer quantity;

	public MenuDTO(String itemName, Integer itemCost, Integer quantity) {
		super();
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.quantity = quantity;
	}

	public MenuDTO() {
		super();
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getItemCost() {
		return itemCost;
	}

	public void setItemCost(Integer itemCost) {
		this.itemCost = itemCost;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "MenuDTO [itemName=" + itemName + ", itemCost=" + itemCost + ", quantity=" + quantity + "]";
	}
	
	

}
