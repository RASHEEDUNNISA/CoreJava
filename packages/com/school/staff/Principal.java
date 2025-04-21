package com.school.staff;

public class Principal {
	private String principalName;
	private int experienceYears;
	public String getPrincipalName() {
		return principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}
	public int getExperienceYears() {
		return experienceYears;
	}
	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}
	
	public void showPrincipal() {
		System.out.println("Principal Name "+principalName);
		System.out.println("Experince Years "+experienceYears);
	}
}
