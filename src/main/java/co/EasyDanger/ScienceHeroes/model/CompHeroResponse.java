package co.EasyDanger.ScienceHeroes.model;

import java.util.List;

public class CompHeroResponse {
	
	private List<Hero> complete;
	private List<TinyHero> tiny;
	
	public CompHeroResponse() {
		
	}
	
	public CompHeroResponse(List<Hero> complete, List<TinyHero> tiny) {
		super();
		this.complete = complete;
		this.tiny = tiny;
	}

	public List<Hero> getComplete() {
		return complete;
	}

	public void setComplete(List<Hero> complete) {
		this.complete = complete;
	}

	public List<TinyHero> getTiny() {
		return tiny;
	}

	public void setTiny(List<TinyHero> tiny) {
		this.tiny = tiny;
	}

	@Override
	public String toString() {
		return "CompHeroResponse [complete=" + complete + ", tiny=" + tiny + "]";
	}
	
}
