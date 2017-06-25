package review_package;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class ReviewRepo {

	protected Map<Long, TacoReview> reviews = new HashMap<>();

	public ReviewRepo() {
		TacoReview condadoTacos = new TacoReview(1, "Condado", "images/condadoTacos.jpeg",
				"4 out of 5 Tacos!",
				"Condado Tacos... This establishment seems to be the new hip place to visit for DIY tacos. They have a "
				+ "simple form that you fill out specifying all the delicious tacos toppings you can think of. Fear not "
				+ "vegetarian/vegan friends, they also have options for you if you aren't feeling carnivorous. Keep in mind "
				+ "that the usual free chips and salsa you get at restaurants is not free at all. Still delicious!");
		reviews.put(1L, condadoTacos);

		TacoReview cantinaTacos = new TacoReview(2, "Local Cantina", "images/cantinaTacos.jpeg",
				"3 out of 5 Tacos!", "Local Cantina... This fun taco joint has everything you are looking for if a fun night on the "
						+ "town is #goals. Tacos, Booze, Parties? Can you ask for more? Oh yeah... free chips and a variety of salsa"
						+ " to choose from. Their tacos are tasty but they fall short on filling it to the brim. But $2 Taco Tuesday "
						+ "makes up for that.");
		reviews.put(2L, cantinaTacos);

		TacoReview mimexico = new TacoReview(3, "Mi Mexico", "images/miMexicoTacos.jpeg", "4.5 out of 5 Tacos!",
				"Mi Mexico... This restaurant is a bit outside downtown Columbus but worth the drive. If you are looking for an "
				+ "affordable place to eat authentic Mexican food look no further. They have a huge menu to pick from but that "
				+ "doesn't stop them from still making sure their tacos are top of the line. Like your food extra hot? You may "
				+ "re-think that when you visit.");
		reviews.put(3L, mimexico);

	}

	public Collection<TacoReview> findAll() {
		return reviews.values();
	}

	public TacoReview findOne(Long id) { // use method to return map entry
		return reviews.get(id);
	}
}
