package symphony.domain.concert;
import java.util.ArrayList;

import symphony.domain.*;
import symphony.domain.people.Conductor;


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
public class Concert {
	private final Venue 					venue;
	private final Conductor 				conductor;
	private final ArrayList<Composition> 	performance;
	private final Date 						date;
	
	public static class Builder{
		//TODO decide what is required or optional
		private Venue 					venue;
		private Conductor 				conductor;
		private ArrayList<Composition> 	performance;
		private Date 					date;
		
		//constructor
		public Builder () {
			
		}
		
		//builder properties
		public Builder venue(Venue val) {
			venue = val;
			return this;
		}
		
		public Builder conductor(Conductor val) {
			conductor = val;
			return this;
		}
		
		public Builder perfomance(Composition val) {
			performance.add(val);
			return this;
		}
		
		public Builder date(Date val) {
			date = val;
			return this;
		}
	}//end of builder
	
	private Concert(Builder builder) {
		venue 		= builder.venue;
		conductor 	= builder.conductor;
		performance = builder.performance;
		date 		= builder.date;
	}//end of constructor

	public Venue getVenue() {
		return venue;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public ArrayList<Composition> getPerformance() {
		return performance;
	}

	public Date getDate() {
		return date;
	}
	
	

}
