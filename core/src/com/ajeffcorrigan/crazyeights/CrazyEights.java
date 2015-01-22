package com.ajeffcorrigan.crazyeights;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class CrazyEights extends ApplicationAdapter {
	SpriteBatch batch;
	TextureRegion img;
	
	//Game size.
	public static int GAMEHEIGHT;
	public static int GAMEWIDTH; 
	
	//AssetManager
	AssetManager manager = new AssetManager();
	
	//Have the assets been loaded?
	public static boolean assetsInit = false;
	
	@Override
	public void create () {
		
		//Set the size of the game based on the screen.
		GAMEHEIGHT = Gdx.graphics.getHeight();
		GAMEWIDTH = Gdx.graphics.getWidth();
		
		batch = new SpriteBatch();
		

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.end();
	}
	
	static enum gameState {
		ingame, beforegame, endgame;
	}

}
