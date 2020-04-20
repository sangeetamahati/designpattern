package designpatterns;

public class ManagePacketMembers {

	public static void main(String[] args) {
	//	PacketInternationaMemberFactory factory =new PacketInternationaMemberFactory();
		MemberFactory international=PacketFactoryProducer.getMemberFactory("International");
		Member member1=international.Subscribe("Annual");
		member1.registermember("Sangeeta");
		member1.showmember();
		System.out.println("-----------------------------------");
		
		Member member2=international.Subscribe("lifetime");
		member2.registermember("Mahati");
		member2.showmember();
		System.out.println("-----------------------------------");
		
		Member member3=international.Subscribe("Temporary");
		member3.registermember("Savitri");
		member3.showmember();
		System.out.println("-----------------------------------");
		

	}

}
