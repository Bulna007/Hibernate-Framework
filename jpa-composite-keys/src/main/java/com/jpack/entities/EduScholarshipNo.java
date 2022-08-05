package com.jpack.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EduScholarshipNo implements Serializable
{
	protected int eduscno;
	@Column(name="aadhar_no")
	protected String aadharNo;
	@Column(name="college_code")
	protected String collegeCode;
	public int getEduscno() {
		return eduscno;
	}
	public void setEduscno(int eduscno) {
		this.eduscno = eduscno;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getCollegeCode() {
		return collegeCode;
	}
	public void setCollegeCode(String collegeCode) {
		this.collegeCode = collegeCode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aadharNo == null) ? 0 : aadharNo.hashCode());
		result = prime * result + ((collegeCode == null) ? 0 : collegeCode.hashCode());
		result = prime * result + eduscno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EduScholarshipNo other = (EduScholarshipNo) obj;
		if (aadharNo == null) {
			if (other.aadharNo != null)
				return false;
		} else if (!aadharNo.equals(other.aadharNo))
			return false;
		if (collegeCode == null) {
			if (other.collegeCode != null)
				return false;
		} else if (!collegeCode.equals(other.collegeCode))
			return false;
		if (eduscno != other.eduscno)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EduScholarshipNo [eduscno=" + eduscno + ", aadharNo=" + aadharNo + ", collegeCode=" + collegeCode + "]";
	}
	
}
