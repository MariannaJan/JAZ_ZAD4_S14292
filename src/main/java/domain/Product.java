package domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@NamedQueries({
	@NamedQuery(name="product.all", query="SELECT p FROM Product p"),
	@NamedQuery(name="product.id", query="SELECT p FROM Product p WHERE p.productId = :productId"),
	@NamedQuery(name="product.name", query="SELECT p FROM Product p WHERE p.name = :name"),
	@NamedQuery(name="product.category", query="SELECT p FROM Product p WHERE p.category = :category"),
	@NamedQuery(name="product.priceRange", query="SELECT p FROM Product p WHERE p.price BETWEEN :min AND :max")
})

public class Product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String name;
	@Enumerated(EnumType.STRING)
	private Category category;
	private double price;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


}
