package designpatterns;

public class PacketFactoryProducer {
	public static MemberFactory getMemberFactory(String Nationality){
		MemberFactory memberFactory=null;
		switch(Nationality.toUpperCase()){
		
		case "NATIONAL":
		      memberFactory=new PacketNationalMemberFactory();
		      break;
		case "INTERNATIONAL":
		      memberFactory=new PacketInternationaMemberFactory();
		      break;
		         
		      
		}
		return memberFactory;
	}

}
