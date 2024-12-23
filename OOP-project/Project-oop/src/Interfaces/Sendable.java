package Interfaces;

import java.io.IOException;

import Communication.Request;

public interface Sendable {
	public void sendRequest(Request request) throws IOException;
}