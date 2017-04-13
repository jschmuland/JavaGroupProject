package symphony.domain.concert;

import java.util.ArrayList;

import symphony.domain.NameID;
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
* @author Joel Schmuland
* @version 1.0 April 6, 2017
*/
public class Composition extends NameID{
	private ArrayList<Movement> movement;
	private ArrayList<Soloist> soloest;
	private String composer;
	
	public void addMovement(Movement val) {
		movement.add(val);
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public ArrayList<Soloist> getSoloest() {
		return soloest;
	}

	public void setSoloest(Soloist soloest) {
		this.soloest.add(soloest);
	}
	
	
}
