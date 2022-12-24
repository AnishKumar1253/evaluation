package com.masai.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "Device")
@NamedQuery(name = "device.getAll",query = "from Device")
public class Device {
	@Id
	private int id;
	private String model;
	private String brand;
	private String type;
	private int price;
	private String camera_spec;
	private String processor_spec;
	private String memory_spec;
	private String os_spec;
	private String size_spec;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCamera_spec() {
		return camera_spec;
	}
	public void setCamera_spec(String camera_spec) {
		this.camera_spec = camera_spec;
	}
	public String getProcessor_spec() {
		return processor_spec;
	}
	public void setProcessor_spec(String processor_spec) {
		this.processor_spec = processor_spec;
	}
	public String getMemory_spec() {
		return memory_spec;
	}
	public void setMemory_spec(String memory_spec) {
		this.memory_spec = memory_spec;
	}
	public String getOs_spec() {
		return os_spec;
	}
	public void setOs_spec(String os_spec) {
		this.os_spec = os_spec;
	}
	public String getSize_spec() {
		return size_spec;
	}
	public void setSize_spec(String size_spec) {
		this.size_spec = size_spec;
	}
	public Device(int id, String model, String brand, String type, int price, String camera_spec, String processor_spec,
			String memory_spec, String os_spec, String size_spec) {
		super();
		this.id = id;
		this.model = model;
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.camera_spec = camera_spec;
		this.processor_spec = processor_spec;
		this.memory_spec = memory_spec;
		this.os_spec = os_spec;
		this.size_spec = size_spec;
	}
	public Device() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Device [id=" + id + ", model=" + model + ", brand=" + brand + ", type=" + type + ", price=" + price
				+ ", camera_spec=" + camera_spec + ", processor_spec=" + processor_spec + ", memory_spec=" + memory_spec
				+ ", os_spec=" + os_spec + ", size_spec=" + size_spec + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((camera_spec == null) ? 0 : camera_spec.hashCode());
		result = prime * result + id;
		result = prime * result + ((memory_spec == null) ? 0 : memory_spec.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((os_spec == null) ? 0 : os_spec.hashCode());
		result = prime * result + price;
		result = prime * result + ((processor_spec == null) ? 0 : processor_spec.hashCode());
		result = prime * result + ((size_spec == null) ? 0 : size_spec.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (camera_spec == null) {
			if (other.camera_spec != null)
				return false;
		} else if (!camera_spec.equals(other.camera_spec))
			return false;
		if (id != other.id)
			return false;
		if (memory_spec == null) {
			if (other.memory_spec != null)
				return false;
		} else if (!memory_spec.equals(other.memory_spec))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (os_spec == null) {
			if (other.os_spec != null)
				return false;
		} else if (!os_spec.equals(other.os_spec))
			return false;
		if (price != other.price)
			return false;
		if (processor_spec == null) {
			if (other.processor_spec != null)
				return false;
		} else if (!processor_spec.equals(other.processor_spec))
			return false;
		if (size_spec == null) {
			if (other.size_spec != null)
				return false;
		} else if (!size_spec.equals(other.size_spec))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	

}
