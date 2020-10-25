package com.manipal.dp.structural.adapter;

public class MediaAdapter implements MediaPlayer {
	
	AdvancedMediaPlayer player;
	
	public MediaAdapter(String mediaType)
	{
		if(mediaType.equalsIgnoreCase("vlc"))
			player = new VLCPlayer();
		else if(mediaType.equalsIgnoreCase("MP4"))
			player = new Mp4Player();
	
	}

	@Override
	public void play(String mediaType, String fileName)
	{
		
		if(mediaType.equalsIgnoreCase("VLC"))
			player.playVLC(fileName);
		else if(mediaType.equalsIgnoreCase("MP4"))
			player.playMP4(fileName);
		
	}

}
