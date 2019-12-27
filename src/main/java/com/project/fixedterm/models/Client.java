package com.project.fixedterm.models;

public class Client {
	
	private String codePerson;
    private String name;
    private String lastName;
    private String dni;
    
    public Client() {
		
	}

	public String getCodePerson() {
		return codePerson;
	}

	public void setCodePerson(String codePerson) {
		this.codePerson = codePerson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
    
}
