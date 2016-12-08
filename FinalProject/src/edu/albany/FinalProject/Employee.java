/**
 * 
 */
package edu.albany.FinalProject;

/**
 *NflEmployee
 * @author Kyle Jeffreys
 ** A class to represent employees.
 */
public class Employee {
	
		private String fname;
		private String lname;  
		private double salary; 
		private String franchise;	//who the employee works for
		private String title;	//job type
		
		
		
		/**
		 * Constructs an employee with first & last
		 * name as well as initial salary, franchise, and job title.
		 * @param f	--first name
		 * @param l	--last name
		 * @param s --salary
		 * @param fran -- franchise
		 * @param title -- job title
		 */


		public Employee(String f, String l, double s, String fran, String title) 
		{
			this.fname = f;
			this.lname = l;
			this.salary = s;
			this.franchise = fran;
			this.title = title;
		}


		/**
		 * Gets the first name of this Employee object.
		 * @return the first name.
		 */
		public String getfName()
		{
			return fname;
		}
		
		
		/**
		 * Sets the first name to provided argument.
		 * @param f	--first name for Employee object.
		 */
		public void setfName(String f)
		{
			this.fname = f;
		}
		
		
		/**
		 * Gets the last name of this Employee object.
		 * @return the last name.
		 */
		public String getlName()
		{
			return lname;
		}
		
		
		/**
		 * Sets the last name to provided argument.
		 * @param l	--last name for Employee object.
		 */
		public void setlName(String l)
		{
			this.lname = l;
		}
		
		
		
		
		
		/**
		 * @param s	--new salary assigned
		 */
		public void setSalary(double s)
		 
		{
			if(s > 25000.00)	//checks for minimum salary
			{
				this.salary = s;
			}
			else
			{
				this.salary = 25000.00;
			}
		}
		
		/**
		 * @return --the Employee salary
		 */
		public double getSalary()
		{
			return this.salary;
		}


		/**
		 * @return the franchise
		 */
		public String getFranchise() {
			return franchise;
		}


		/**
		 * @param franchise the franchise to set
		 */
		public void setFranchise(String franchise) {
			this.franchise = franchise;
		}


		/**
		 * @return the title
		 */
		public String getTitle() {
			return title;
		}


		/**
		 * @param title the title to set
		 */
		public void setTitle(String title) {
			this.title = title;
		}
		
		public String toString()
		{
			return fname + " " + lname + ", " + title + " for the " + franchise +
					" makes a salary of " + "$" + salary + "0";
		}

}
