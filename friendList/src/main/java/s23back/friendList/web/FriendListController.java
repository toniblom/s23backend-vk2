package s23back.friendList.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import s23back.friendList.domain.Friend;

@Controller
public class FriendListController {
	
	// missä friends-listaa kuuluisi säilyttää?
	// Miten/missä listalle lisätään kaveri?
	
	@GetMapping("/index")
	public String friendList(@RequestParam(name="friend") String friend, Model model) {
//		Friend friend1 = new Friend("Mikko Mallikas");
//		Friend friend2 = new Friend("Maija Poppanen");
//		ArrayList<Friend> friends = new ArrayList<Friend>();
//		friends.add(friend1);
//		friends.add(friend2);
		model.addAttribute("friend", friend);
		return "friendlist";
	}
	
	@PostMapping("/index")
	public String friendSubmit(@ModelAttribute Friend friend, Model model)
	{
		model.addAttribute("friend", friend);
		return "redirect:/friendlist";
	}

}
