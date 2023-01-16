package many_to_many_uni_lang_dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	private String address;
	private long phone;
	@ManyToMany
	List<Language> language;
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", list=" + language
				+ "]";
	}
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public List<Language> getLanguage() {
		return language;
	}
	public void setLanguage(List<Language> list) {
		this.language = list;
	}
	
	
}
