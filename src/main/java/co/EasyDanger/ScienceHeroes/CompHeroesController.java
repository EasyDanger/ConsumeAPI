package co.EasyDanger.ScienceHeroes;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.EasyDanger.ScienceHeroes.model.Hero;
import co.EasyDanger.ScienceHeroes.model.TinyHero;

@Controller
public class CompHeroesController {

	@Autowired
	private ApiService apiService;

	@RequestMapping("/")
	public ModelAndView home() {
		List<TinyHero> tinies = apiService.getTinyHeroes();
		Collections.sort(tinies, new SortYear());
		return new ModelAndView("index", "Tinies", tinies);
	}

	@RequestMapping("/allOfEm")
	public ModelAndView all() {
		ModelAndView mv = new ModelAndView("allofem");
		List<Hero> heroes = apiService.getHeroes();
//		List<Hero> zeroes = apiService.getHeroes();
		Collections.sort(heroes, new SortYear());
//		Collections.sort(zeroes, new SortReay());
		mv.addObject("Heroes", heroes);
//		mv.addObject("Zeroes", zeroes);
		return mv;
	}

//	@RequestMapping("/emOfAll")
//	public ModelAndView lla() {
//		List<Hero> heroes = apiService.getHeroes();
//		Collections.sort(heroes, new SortReay());
//		return new ModelAndView("allofem", "Heroes", heroes);
//	}
}
