package com.crispyapi;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup("crispyapi")
public interface HttpServerConfig extends Config
{
	@ConfigItem(
			keyName = "PortNum",
			name = "Port number",
			description = "Specify the port to open the webserver towards (default 8081)"
	)
	@Range(min = 1, max = 20000)
	default int portNum()
	{
		return 8081;
	}
}