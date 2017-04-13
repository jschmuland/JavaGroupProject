package symphony.domain;

import symphony.domain.concert.Composition;
import symphony.domain.concert.Movement;
import symphony.domain.people.Conductor;
import symphony.domain.people.Person;
import symphony.domain.people.Soloist;

/**
* CST8288
* Professor: Reg Dyer
* Lab Instructor: Leanne Seaward, Section 013
* Project 1: Symphony Management System
* Due: Friday, April 14, 2017
*
* Group Members:
* Christopher Billings - bill0082@algonquinlive.com
* Bryan Flood - floo0025@algonquinlive.com
* Noah Guthrie - guth0025@algonquinlive.com
* Zhongxuan Li - li000497@algonquinlive.com
* Joel Schmuland - schm0111@algonquinlive.com
*
* // TODO
* Class Info
* 
* @author Bryan Flood McAuley
* @version 1.0 April 6, 2017
*/

public class ID {
	
	private int currentID = 0;
	private static int conductorID = 0;
	private static int soloistID = 0;
	private static int personID = 0;
	private static int compositionID = 0;
	private static int movementID = 0;
	protected String nameID;

	public ID(){
		if (this instanceof Person) {
			nameID="Person";
			personID++;
			currentID = personID;
		}else if(this instanceof Conductor) {
			nameID="Conductor";
			conductorID++;
			currentID = conductorID;
		}else if(this instanceof Soloist){
			nameID="Soloist";
			soloistID++;
			currentID = soloistID;
		}else if(this instanceof Composition){
			nameID="Composition";
			compositionID++;
			currentID = compositionID;
		}else if(this instanceof Movement){
			nameID="Movement";
			movementID++;
			currentID = movementID;
		}		
	}
	
	public int getId() { return currentID; }
	
	
} // End of ID.java

