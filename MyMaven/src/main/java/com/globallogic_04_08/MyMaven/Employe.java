package com.globallogic_04_08.MyMaven;

public class Employe
{
	private int empId;
	private String empName;
	private String empAddr;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", empName=" + empName + ", empAddr=" + empAddr + "]";
	}
	public Employe(int empId, String empName, String empAddr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddr = empAddr;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddr() {
		return empAddr;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
}
