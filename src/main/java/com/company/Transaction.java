package com.company;

import java.util.Objects;


//not used at all
public class Transaction {
	int id;
	String type;
	String date;
	String description;
	public Transaction(int id, String type, String date, String description){
		this.id = id;
		this.type = type;
		this.date = date;
		this.description = description;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Transaction that = (Transaction) o;
		return Objects.equals(id, that.id) && Objects.equals(type, that.type) && Objects.equals(date, that.date) && Objects.equals(description, that.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, type, date, description);
	}
}
