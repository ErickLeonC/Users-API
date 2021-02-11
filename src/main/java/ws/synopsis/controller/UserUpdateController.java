package ws.synopsis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ws.synopsis.beans.User;
import ws.synopsis.beans.UserRegistration;

@Controller
@RequestMapping(value = "/users")
public class UserUpdateController {
	@RequestMapping(method = RequestMethod.PUT, value = "/update")
	@ResponseBody
	public String updateUserRecord(@RequestBody User user) {
		System.out.println("In updateStudentRecord");
		return UserRegistration.getInstance().updateUser(user);
	}
}
