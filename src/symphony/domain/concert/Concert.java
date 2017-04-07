package symphony.domain.concert;
import java.util.ArrayList;

import symphony.domain.*;
import symphony.domain.people.Conductor;

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
	
	

}
