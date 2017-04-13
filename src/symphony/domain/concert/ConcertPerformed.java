package symphony.domain.concert;

import symphony.domain.Date;

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
public class ConcertPerformed {
	private Concert concert;
	private Date date;
	
	public ConcertPerformed(Concert val) {
		this(val,new Date());
	}
	
	public ConcertPerformed(Concert val, Date dateVal) {
		this.setConcert(val);
		this.setDate(dateVal);
	}
	
	public Concert getConcert() {
		return concert;
	}
	public void setConcert(Concert concert) {
		this.concert = concert;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

}
