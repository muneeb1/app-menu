package com.salesforcemenu.service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.salesforcemenu.dao.AppMenuRepository;
import com.salesforcemenu.model.App;
import com.salesforcemenu.model.AppMenu;

@Service
public class AppMenuService implements AppMenuRepository {

	private String serviceUrl = "/services/data/v44.0/ui-api/apps";

	public AppMenu getAll(String access_token, String instance_url)
			throws URISyntaxException, ParseException, IOException {

		AppMenu appMenu = new AppMenu();

		HttpClient httpclient = HttpClientBuilder.create().build();

		URIBuilder builder = new URIBuilder(instance_url);
		builder.setPath(serviceUrl).setParameter("formFactor", "Large");

		HttpGet httpGet = new HttpGet(builder.build());
		httpGet.addHeader("Authorization", "Bearer " + access_token);

		HttpResponse queryResponse = httpclient.execute(httpGet);

		int statusCode = queryResponse.getStatusLine().getStatusCode();
		if (statusCode != HttpStatus.SC_OK) {
			System.out.println("Error authenticating to Force.com: " + statusCode);
		}

		// Convert to string
		String response_string = EntityUtils.toString(queryResponse.getEntity());
		// Map json string to appMenu class
		ObjectMapper mapper = new ObjectMapper();
		AppMenu result = mapper.readValue(response_string, AppMenu.class);
		
		if(result != null) {
		List<App> apps = new ArrayList<>();
		for (App resultedApp : result.getApps()) {
			if (resultedApp.getDeveloperName().equals("Trail_App")) {
				App newApp = new App();
				newApp = resultedApp;
				apps.add(newApp);
			}
		}
		appMenu.setApps(apps);
		}
		return appMenu;
	}

}
