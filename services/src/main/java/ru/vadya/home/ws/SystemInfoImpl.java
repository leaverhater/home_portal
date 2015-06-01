package ru.vadya.home.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "ru.vadya.home.ws.SystemInfo")
public class SystemInfoImpl implements SystemInfo {
	@Override
	public String getSystemInfo() {
		return "Home portal v0.1";
	}

}
