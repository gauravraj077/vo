package com.example.vo;

import com.example.vo.Main.Id;

@Entity
@Id
public class Main {
	public @interface Id {

	}

	private Long id;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
