package ws.synopsis.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ws.synopsis.beans.User;
import ws.synopsis.beans.UserRegistration;

@Controller
public class UserListController {
	@RequestMapping(method = RequestMethod.GET, value="/user/all")
	@ResponseBody
	  public List<User> getAllUser() {
	  return UserRegistration.getInstance().getUserRecords();
	  }
}
