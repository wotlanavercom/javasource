package inter;

public class ActionEx {

	public static void main(String[] args) {
		Action action = new Action() {
			
			@Override
			public void work() {
				System.out.println("work");
				
			}
		};
		action.work();

	}

}
