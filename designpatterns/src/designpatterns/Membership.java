package designpatterns;

import java.util.Date;

public abstract class Membership implements Member {
    public String userId;
    public String username;
    public Date startdate;
    public Date enddate;
    public float discountpercentage;
    public String subscription;
	@Override
	public abstract void registermember(String uname);

	@Override
	public void showmember() {
		
		System.out.println( "Membership [userId=" + userId + ", username=" + username + ", "
				+ "startdate=" + startdate
				+ ", discountpercentage=" + discountpercentage + ","
						+ " subscription=" + subscription + "]");
	}

}
