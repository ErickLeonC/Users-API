package ws.synopsis.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ws.synopsis.beans.User;
import ws.synopsis.beans.UserRegistration;

@RestController
@RequestMapping(value = "/users")
public class UserListController {
	@GetMapping(path="/all")
	@ResponseBody
	public List<User> getAllUser() {
		return UserRegistration.getInstance().getUserRecords();
	}
}
