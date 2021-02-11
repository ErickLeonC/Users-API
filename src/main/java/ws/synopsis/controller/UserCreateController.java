package ws.synopsis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ws.synopsis.beans.User;
import ws.synopsis.beans.UserRegistration;
import ws.synopsis.beans.UserRegistrationReply;

@Controller
public class UserCreateController {
	@RequestMapping(method = RequestMethod.POST, value="/create/user")
	@ResponseBody
	  public UserRegistrationReply registerUser(@RequestBody User user) {
	  System.out.println("In registerUser");
	        UserRegistrationReply usrregreply = new UserRegistrationReply();           
	        UserRegistration.getInstance().add(user);
	        //We are setting the below value just to reply a message back to the caller
	        usrregreply.setId(user.getId());
	        usrregreply.setName(user.getName());
	        usrregreply.setLastName(user.getLastName());
	        usrregreply.setPhone(user.getPhone());
	        usrregreply.setRegistrationStatus("Successful");

	        return usrregreply;
	}

}
