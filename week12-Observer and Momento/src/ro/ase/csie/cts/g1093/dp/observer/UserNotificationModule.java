package ro.ase.csie.cts.g1093.dp.observer;

public class UserNotificationModule implements ConnectionStatusInterface {

	@Override
	public void connectionUp() {
		System.out.println("PopUp: connection is active");
		
	}

	@Override
	public void connectioDown() {
		System.out.println("PopUp: Connection to the server was lost");
		
	}

}
