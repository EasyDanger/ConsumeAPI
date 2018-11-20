package co.EasyDanger.ScienceHeroes;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.EasyDanger.ScienceHeroes.model.CompHeroResponse;
import co.EasyDanger.ScienceHeroes.model.Hero;
import co.EasyDanger.ScienceHeroes.model.TinyHero;

@Component
public class ApiService {
	
	private RestTemplate restTemplateWithUserAgent;
	{
		// This configures the restTemplateWithUserAgent to include a User-Agent header
		// with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is
		// required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplateWithUserAgent = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public List<Hero> getHeroes() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		CompHeroResponse response = restTemplateWithUserAgent.getForObject(url, CompHeroResponse.class);
		return response.getComplete();
	}
	
	public List<TinyHero> getTinyHeroes() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		CompHeroResponse response = restTemplateWithUserAgent.getForObject(url, CompHeroResponse.class);
		return response.getTiny();
	}

}
