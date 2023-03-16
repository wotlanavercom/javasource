package inheritance;

public class DmbCellphone extends Cellphone {
	//Cellphone + Dmb 기능 추가
	int channel;
	
	void turnOnDmb() {
		System.out.println("채널 "+channel+"번 DMB 방송 시작");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 "+channel+"번으로 변경");
	}
	void turnOffDmb() {
		System.out.println("채널 "+channel+"번 DMB 방송 시작");
	}

}
