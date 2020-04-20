package designpatterns;

public class PacketInternationaMemberFactory implements MemberFactory {

	@Override
	public Member Subscribe(String SubscriptionType) {
		// TODO Auto-generated method stub
		Member member= null;
		switch(SubscriptionType.toUpperCase()){
			
			case"LIFETIME":
				member= new LifeTimeMember();
				break;
			case "ANNUAL":
				member=new MonthlyMember();
				break;
			case "TEMPORARY":
				member=new TempororyMember();
				break;
				
		}
		return member;
	}

}
