package control;

import view.MainFrame;

public class Main {

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		Events events = new Events(frame);
		frame.applyEvents(events);

	}

}
