/**
 * 
 */
package edu.albany.FinalProject;


/**
 * NflFranchise - abstract class that implements INflFranchise
 * @author Kyle Jeffreys
 *
 */
public abstract class Franchise implements IFranchise
{
	private Owner owner;
	private double franchiseValue;
	private String franchiseLocation;

	
	//the net worth of the franchise
	public double getValue()
	{
		return franchiseValue;
	}
	
	@Override
	public void setValue(double val)
	{
		this.franchiseValue = val;
	}
	
	//returns the owner of the franchise
	public String getOwner()
	{
		return this.owner.getfName() + " " + this.owner.getlName();
	}
	
	public void setOwner(Owner owner)
	{
		this.owner = owner;
	}
	
	public void sellFranchise(Owner newOwner)
	{
		this.owner = newOwner;
		System.out.println("The franchise has been sold.\n" + newOwner);
	}
	
	//returns the location of the franchise
	public String getLocation()
	{
		return franchiseLocation;
	}
	
	public void setLocation(String city)
	{
		this.franchiseLocation = city;
	}
	
	//returns a String representation of the franchise
	public String toString()
	{
		return "This organization is owned " + owner.toString() + " and is located in " + franchiseLocation;
	}
	
	
}
