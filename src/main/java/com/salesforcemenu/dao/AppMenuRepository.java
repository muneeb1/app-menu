package com.salesforcemenu.dao;

import java.io.IOException;
import java.net.URISyntaxException;

import org.json.simple.parser.ParseException;

import com.salesforcemenu.model.AppMenu;

public interface AppMenuRepository {

	public AppMenu getAll(String access_token, String instance_url)
			throws URISyntaxException, ParseException, IOException;
}
