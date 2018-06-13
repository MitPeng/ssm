package com.oracle.model;

public class Role {
	private Integer id;
	private String roleName;
	private String roleCode;
	public Role(Integer id, String roleName, String roleCode) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.roleCode = roleCode;
	}
	public Role() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	
}
