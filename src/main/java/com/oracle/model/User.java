package com.oracle.model;

import java.sql.Timestamp;

public class User {
	private Integer id;
	private String realName;
	private String nickName;
	private String sex;
	private String birthdate;
	private String passWord;
	private String phone;
	private String email;
	private String question;
	private String answer;
	private String regDate;
	private String lastLoginDate;
	private String lastLoginIp;
	private String salt;
	
	public User() {
		super();
	}
	public User(Integer id, String realName, String nickName, String sex, String birthdate, String passWord,
			String phone, String email, String question, String answer, String regDate, String lastLoginDate,
			String lastLoginIp, String salt) {
		super();
		this.id = id;
		this.realName = realName;
		this.nickName = nickName;
		this.sex = sex;
		this.birthdate = birthdate;
		this.passWord = passWord;
		this.phone = phone;
		this.email = email;
		this.question = question;
		this.answer = answer;
		this.regDate = regDate;
		this.lastLoginDate = lastLoginDate;
		this.lastLoginIp = lastLoginIp;
		this.salt = salt;
	}

	public User(String passWord, String phone, String salt) {
		super();
		this.passWord = passWord;
		this.phone = phone;
		this.salt = salt;
	}
	
	public User(String passWord, String phone) {
		super();
		this.passWord = passWord;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(String lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public String getLastLoginIp() {
		return lastLoginIp;
	}
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", realName=" + realName + ", nickName=" + nickName + ", sex=" + sex + ", birthdate="
				+ birthdate + ", passWord=" + passWord + ", phone=" + phone + ", email=" + email + ", question="
				+ question + ", answer=" + answer + ", regDate=" + regDate + ", lastLoginDate=" + lastLoginDate
				+ ", lastLoginIp=" + lastLoginIp + ", salt=" + salt + "]";
	}
	
}
