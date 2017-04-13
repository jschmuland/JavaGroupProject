package symphony.domain;

public class NameID extends ID {
	
	private String namePlusID;
	protected String title;

	public String getNameID() {
		
		String callerName = super.nameID;
		int callerID = super.getId();		
		namePlusID = callerName + callerID;
		
		return namePlusID;
	}

	/** this method sets the name of whatever Object is calling it. Uses inheritance to name Conductors, Soloists, Customers, Compositions, Movements etc */
	public void setName(String name) { this.title=name;} 

	/** this methods returns the name you have given your object. */
	public String getName(){ return title; }
	
} // End of NameID.java