package com.springbatch.dto.NTS;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.Date;

public class DateRange implements Serializable {

    private static final long serialVersionUID = -7509715610631924087L;

    private Date from;

    private Date to;

//    public Date getFrom() {
//        return from;
//    }

	public String getFrom() {
	  if(this.from == null) {
	  		return null;
	  }
	  return new DateTime(this.from).toString("yyyy-MM-dd");

	}
    
//    public void setFrom(Date from) {
//        this.from = from;
//    }

    public String getTo() {
  	  if(this.to == null) {
	  		return null;
	  }
      
  	  return new DateTime(this.to).toString("yyyy-MM-dd");
    }

//	public Date getTo() {
//	  return to;
//	}
    
    public void setTo(Date to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return new DateTime(this.from).toString("yyyy-MM-dd")
                + " ~ " +
                new DateTime(this.to).toString("yyyy-MM-dd");
    }
}
