package design_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObserverDesignPattern {
/*It si behavioural Design Pattern
 * In this when subject changes the state all its dependent objects notified the changes.
 * one to many relation
 * */
public static void main(String[] args) throws NumberFormatException, IOException {
	YoutubeChannel channel = new YoutubeChannel();
	Subcriber sub = new Subcriber("Saurabh");
	Subcriber gaurav = new Subcriber("Gaurav");
	channel.subscribe(gaurav);
	channel.subscribe(sub);
	channel.newVideoUploaded("Learn Design Pattern");
	channel.newVideoUploaded("New Angular Course");

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	while (true) {
		System.out.println("Press 1 to uplaod Video ");
		System.out.println("Press 2 create new Subscriber");
		System.out.println("Pres 3 to exit");
		int c = Integer.parseInt(br.readLine());
		if (c == 1) {
			// new video uplaode code
			System.out.println("Enter new Video Title");
			String videoTitle = br.readLine();
			channel.newVideoUploaded(videoTitle);
		} else if (c == 2) {
			/// create new subscriber
			System.out.println("Enter name of subscriber");
			String subscribername = br.readLine();
			channel.subscribe(new Subcriber(subscribername));

		} else if (c == 3) {
			// exit

			System.out.println("Thank you for using app");
			break;
		} else {
			// exit wrong input
			System.out.println("Wrong Input");
		}
	}
}
}
