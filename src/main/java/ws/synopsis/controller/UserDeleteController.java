package ws.synopsis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ws.synopsis.beans.UserRegistration;

@Controller
@RequestMapping(value = "/users")
public class UserDeleteController {
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
	@ResponseBody
	public String deleteStudentRecord(@PathVariable("id") int id) {
		System.out.println("In deleteUserRecord");
		return UserRegistration.getInstance().deleteUser(id);
	}
}
