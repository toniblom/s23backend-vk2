package s23back.friendList.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import s23back.friendList.domain.Friend;

@Controller
public class FriendListController {

	// Mihin kohtaan koodi, jolla listalle lisätään kaveri?
	
	ArrayList<Friend> friends = new ArrayList<Friend>();

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("friends", friends);
		return "friendlist";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public String addFriendt(@ModelAttribute String name, Model model) {
		// Friend friend = new Friend(name);
		// friends.add(friend);
		model.addAttribute("name", name);
		return "friendlist";
	}

	
// This version works with only 1 friend
//
//	@RequestMapping(value = "/index", method = RequestMethod.GET)
//	public String greetingForm(Model model) {
//		model.addAttribute("friend", new Friend());
//		return "friendlist";
//	}
//
//	@RequestMapping(value = "/index", method = RequestMethod.POST)
//	public String greetingSubmit(@ModelAttribute Friend name, Model model) {
//		model.addAttribute("friend", name);
//		return "friendlist";
//	}

}












