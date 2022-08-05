package com.jpack.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="edu_scholarship")
public class EduScholarship implements Serializable
{
	@EmbeddedId
	protected EduScholarshipNo eduScholarshipNo;
	protected String fullname;
	protected LocalDate dob;
	protected String gender;
	protected int grade;
	protected String medium;
	@Column(name="academic_year")
	protected String academicYear;
	@Column(name="grant_amount")
	protected double grantAmount;
	public EduScholarshipNo getEduScholarshipNo() {
		return eduScholarshipNo;
	}
	public void setEduScholarshipNo(EduScholarshipNo eduScholarshipNo) {
		this.eduScholarshipNo = eduScholarshipNo;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public String getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}
	public double getGrantAmount() {
		return grantAmount;
	}
	public void setGrantAmount(double grantAmount) {
		this.grantAmount = grantAmount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((academicYear == null) ? 0 : academicYear.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((eduScholarshipNo == null) ? 0 : eduScholarshipNo.hashCode());
		result = prime * result + ((fullname == null) ? 0 : fullname.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + grade;
		long temp;
		temp = Double.doubleToLongBits(grantAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((medium == null) ? 0 : medium.hashCode());
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
		EduScholarship other = (EduScholarship) obj;
		if (academicYear == null) {
			if (other.academicYear != null)
				return false;
		} else if (!academicYear.equals(other.academicYear))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (eduScholarshipNo == null) {
			if (other.eduScholarshipNo != null)
				return false;
		} else if (!eduScholarshipNo.equals(other.eduScholarshipNo))
			return false;
		if (fullname == null) {
			if (other.fullname != null)
				return false;
		} else if (!fullname.equals(other.fullname))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (grade != other.grade)
			return false;
		if (Double.doubleToLongBits(grantAmount) != Double.doubleToLongBits(other.grantAmount))
			return false;
		if (medium == null) {
			if (other.medium != null)
				return false;
		} else if (!medium.equals(other.medium))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EduScholarship [eduScholarshipNo=" + eduScholarshipNo + ", fullname=" + fullname + ", dob=" + dob
				+ ", gender=" + gender + ", grade=" + grade + ", medium=" + medium + ", academicYear=" + academicYear
				+ ", grantAmount=" + grantAmount + "]";
	}
}
