package com.ajeffcorrigan.crazyeights.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ajeffcorrigan.crazyeights.CrazyEights;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Crazy Eights";
        config.width = 480;
        config.height = 320;
        config.resizable = false;
		new LwjglApplication(new CrazyEights(), config);
	}
}
