package ws.synopsis.beans;

import java.util.ArrayList;
import java.util.List;

public class UserRegistration {
	private List<User> userRecords;

	private static UserRegistration usrregd = null;

	private UserRegistration() {
		userRecords = new ArrayList<User>();
	}

	public static UserRegistration getInstance() {

		if (usrregd == null) {
			usrregd = new UserRegistration();
			return usrregd;
		} else {
			return usrregd;
		}
	}

	public void add(User user) {
		userRecords.add(user);
	}

	public String updateUser(User user) {

		for (int i = 0; i < userRecords.size(); i++) {
			User user_ = userRecords.get(i);
			int a = user.getId();
			int b = user_.getId();
			if (a==b) {  //user_.getId().equals(user.getId())
				userRecords.set(i, user);
				return "Update successful";
			}
		}

		return "Update un-successful";
	}

	public String deleteUser(int id) {

		for (int i = 0; i < userRecords.size(); i++) {
			User user = userRecords.get(i);
			int a = user.getId();
			if (id==a) {
				userRecords.remove(i);// update the new record
				return "Delete successful";
			}
		}

		return "Delete un-successful";
	}

	public List<User> getUserRecords() {
		return userRecords;
	}

}
