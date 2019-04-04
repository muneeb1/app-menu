package com.salesforcemenu.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import org.apache.http.client.ClientProtocolException;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.salesforcemenu.model.AppMenu;
import com.salesforcemenu.service.AppMenuService;

@RestController
public class AppMenuController {

	@Autowired
	AppMenuService appMenuService;

	@RequestMapping(value = "/v1/mobile/AppMenu", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public AppMenu getAll(@RequestHeader(value = "access_token") String accessToken,
			@RequestHeader(value = "instance_url") String instanceUrl,
			@RequestParam(value = "ID", defaultValue = "") String id)
			throws URISyntaxException, ClientProtocolException, IOException, ParseException {

		 AppMenu appMenu = appMenuService.getAll(accessToken, instanceUrl);
		return appMenu;
	}
}
