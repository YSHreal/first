package com.own;

public class Person {
	private int id;//idֵ��̬����
	private String name;
	private String age;
	private String sex;
	private String telNum;
	private String address;
	/**
	 * ���췽��
	 */
	public Person() {
		super();
	}
	public Person(String name, String age, String sex, String telNum, String address) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.telNum = telNum;
		this.address = address;
	}
	/**
	 * setters and getters
	 */
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTelNum() {
		return telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append("#").append(id).append("\t");
		sb.append("������").append(name).append("\t");
		sb.append("����:").append(age).append("\t");
		sb.append("�Ա�:").append(sex).append("\t");
		sb.append("����:").append(telNum).append("\t");
		sb.append("סַ:").append(address).append("\n");
		return sb.toString();
	}
}
