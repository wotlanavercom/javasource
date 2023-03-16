package inheritance;

public class DmbCellphoneEx {

	public static void main(String[] args) {
		// 부모 클래스 객체 생성
		Cellphone cellphone =new Cellphone();
		
		
		//자식 클래스 객체 생성
		DmbCellphone dmbCellphone = new DmbCellphone();
		dmbCellphone.model = "자바폰";
		dmbCellphone.color = "black";
		dmbCellphone.channel = 7;
		
		dmbCellphone.powerOn();
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(8);
		dmbCellphone.turnOffDmb();
		dmbCellphone.bell();
		dmbCellphone.senVoice("여보세요");
		dmbCellphone.receiveVoice("안녕하세요");
		dmbCellphone.hangUp();

	}

}
