package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class usercontroller {

	@RequestMapping(value="{name}", method = RequestMethod.GET)
	public @ResponseBody user getuser(@PathVariable String name) {

		user user = new user();

		user.setName(name);
		user.setId(1);

		return user;
	}
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public @ResponseBody String hello()
	{
		System.out.println("hello");
		return "test";
	}
}

