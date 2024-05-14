package Test.SpringBootAllOperation.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class product {
	@Id
	private int id;
	private String name;
	private String shape;
	private String colour;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", shape=" + shape + ", colour=" + colour + "]";
	}
	
}
