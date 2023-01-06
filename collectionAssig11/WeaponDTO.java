package com.xworkz.collectionAssig11;

import java.io.Serializable;
import java.time.LocalDate;

public class WeaponDTO implements Serializable, Comparable<WeaponDTO> {
	private String name;
	private String madeBy;
	private LocalDate madeOn;
	private int price;
	private Type type;

	public WeaponDTO() {
		super();
	}

	public WeaponDTO(String name, String madeBy, LocalDate madeOn, int price, Type type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public int hashCode() {

		return 50;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {

			if (obj instanceof WeaponDTO) {

				WeaponDTO dto = (WeaponDTO) obj;
				if (dto.name.equals(this.name) && dto.madeBy.equals(this.madeBy)) {
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public int compareTo(WeaponDTO o) {

		return this.name.compareTo(o.name);
	}

	public String getName() {
		return name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public LocalDate getMadeOn() {
		return madeOn;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
