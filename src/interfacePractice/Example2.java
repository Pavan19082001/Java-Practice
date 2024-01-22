package interfacePractice;

class Phone{
	public void call() {System.out.println("Phone calling");}
	public void sms() {System.out.println("Phone sending sms");}
}

interface ICamera{
	void click();
	void record();
}

interface IMusicPlayer{
	void play();
	void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer{
	
	public void videoCall() {System.out.println("Video calling facility...");}

	@Override
	public void play() {
		System.out.println("Smart phone playing music");
	}

	@Override
	public void stop() {
		System.out.println("stopped music");
	}

	@Override
	public void click() {
		System.out.println("photo clicked ");
	}

	@Override
	public void record() {
		System.out.println("Video is being recorded");
	}
}

public class Example2 {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.call();
		phone.play();
		phone.click();  phone.record();
	}

}
