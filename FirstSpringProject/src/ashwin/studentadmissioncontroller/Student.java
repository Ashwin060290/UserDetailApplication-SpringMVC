package ashwin.studentadmissioncontroller;

import java.util.ArrayList;
//import java.util.Date;



import javax.validation.constraints.*;


public class Student {
	
	@Pattern(regexp="[^0-9]*")
	private String name;
	
	@Size(min=2,max=30) @IsValidHobby(listOfValidHobbies="football|cricket|chess")
	private String hobby;
	
	private long number;
	
	
	private String date;
	
	private ArrayList<String> skills;
	private Address studadd;
	
	
	public Address getStudadd() {
		return studadd;
	}
	public void setStudadd(Address studadd) {
		this.studadd = studadd;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public ArrayList<String> getSkills() {
		return skills;
	}
	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	

}
