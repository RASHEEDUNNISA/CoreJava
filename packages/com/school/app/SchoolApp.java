package com.school.app;
import com.school.management.School;
import com.school.staff.Principal;
public class SchoolApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s=new School();
		s.setName("St.Ans");
		s.setLocation("Hyderabad Telangana");
		
		Principal p=new Principal();
		p.setPrincipalName("Buddi");
		p.setExperienceYears(5);
		s.showSchoolInfo();
		System.out.println();
		p.showPrincipal();
		
	}
}
