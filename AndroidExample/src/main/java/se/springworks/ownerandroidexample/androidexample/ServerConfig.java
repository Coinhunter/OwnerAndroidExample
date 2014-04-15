package se.springworks.ownerandroidexample.androidexample;

import org.aeonbits.owner.Config;

/**
 * Created by Conrad Ljungström on 2014-04-03.
 */
public interface ServerConfig extends Config {
	@DefaultValue("USERONAMO")
	String user_id();

	@DefaultValue("PASSOWORDO")
	String user_pw();

	@DefaultValue("http://localhost:3000/v1")
	String local_server_url();

	@DefaultValue("https://api.machinetohuman.com/v1/")
	String server_url();
}