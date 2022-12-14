package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	
	private Product product;
	
	public OrderItem() {
	}
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getPrice() {
		return price;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	public Product getProduct() {
		return product;
	}
	
	public Double subTotal() {
		return price*quantity;
	}
	
	public String toString() {
		return getProduct().getName()+", R$"+
				String.format("%.2f", price)+", quantidade: "+
				quantity+", subtotal: R$"+
				String.format("%.2f", subTotal());
	}
}
