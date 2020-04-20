package designpatterns;

public class PacketNationalMemberFactory implements MemberFactory {

	@Override
	public Member Subscribe(String SubscriptionType) {
		Member member=null;
		
		if(SubscriptionType.equalsIgnoreCase("Monthly"))
		{
			member=new MonthlyMember();
		}
		return member;
	}

}
