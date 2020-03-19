package cl.cnsv.poc.model;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = -2587947569994531286L;
	private Integer id;
	private String name;
	private double price;

	public Book() {
		super();
	}

	public Book(Integer id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}