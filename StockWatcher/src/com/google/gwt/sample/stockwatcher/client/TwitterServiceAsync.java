package com.google.gwt.sample.stockwatcher.client;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface TwitterServiceAsync {
	void login(AsyncCallback<TwitterInfo> callback);

	void tweetNote(String symbol, AsyncCallback<Void> callback);

	void logoutTwitter(AsyncCallback<String> callback);
	
}
