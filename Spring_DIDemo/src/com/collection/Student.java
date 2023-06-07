package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student { 
	private List<Integer> id;
	private Set<String> name;
	private Map<String,String>  cls;
	
	public Student() {}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cls=" + cls + "]";
	}

	public List<Integer> getId() {
		return id;
	}

	public void setId(List<Integer> id) {
		this.id = id;
	}

	public Set<String> getName() {
		return name;
	}

	public void setName(Set<String> name) {
		this.name = name;
	}

	public Map<String, String> getCls() {
		return cls;
	}

	public void setCls(Map<String, String> cls) {
		this.cls = cls;
	}

	
	
}
