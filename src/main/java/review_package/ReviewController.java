package review_package;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController { // handles requests in browser

	@Resource
	ReviewRepository reviewRepo = new ReviewRepository();

	@RequestMapping("/allreviews")
	public String fetchReview(Model model) {
		model.addAttribute("reviewsAsCollection", reviewRepo.findAll());
		return "alltacos";
	}

	@RequestMapping(value = "/singleReview")
	public String oneTaco(@RequestParam("id") Long id, Model model) {
		model.addAttribute("singleReview", reviewRepo.findOne(id));
		return "onetaco";
	}
}
