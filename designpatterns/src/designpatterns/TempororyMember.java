package designpatterns;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class TempororyMember extends Membership {
	public void registermember(String uname) {
		this.userId=UUID.randomUUID().toString();
		this.username=uname;
		this.subscription="lifetime";
		this.startdate=new Date();
		Calendar c= Calendar.getInstance();
		c.add(Calendar.YEAR,60);
		this.enddate=c.getTime();
		this.discountpercentage=90f;
	}
}
