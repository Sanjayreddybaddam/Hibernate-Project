package hibernateproject;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private double price;
	@OneToOne(cascade = CascadeType.ALL) 
	private Charger c;
	
	public Charger getC() {
		return c;
	}
	public void setC(Charger c) {
		this.c = c;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", brand=" + brand + ", price=" + price + ", c=" + c + "]";
	}
	
	
	
	

}
