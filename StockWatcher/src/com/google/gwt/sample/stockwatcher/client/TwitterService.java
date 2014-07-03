package com.google.gwt.sample.stockwatcher.client;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.google.gwt.user.client.rpc.RemoteService;

public interface TwitterService extends RemoteService {
	
	public TwitterInfo login();
	
	public void tweetNote(String symbol);
	
	public String logoutTwitter();
	
}
