package duan2.nhom11.demo.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OrderDetail")
public class OrderDetail{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "order_id",referencedColumnName="order_id" )
	private Order Oder;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "into_money")
	private double intoMoney;

	@ManyToOne
	@JoinColumn(name = "product_id", referencedColumnName="product_id")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name = "user_id",referencedColumnName="user_id" )
	private User user;
	// getter and setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public Order getOder() {
		return Oder;
	}

	public void setOder(Order oder) {
		Oder = oder;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getIntoMoney() {
		return intoMoney;
	}

	public void setIntoMoney(double intoMoney) {
		this.intoMoney = intoMoney;
	}

}
