package com.manipal.dp.structural.adapter;

public class AudioPlayer implements MediaPlayer {
	
	MediaAdapter mediaAdapter;

	@Override
	public void play(String mediaType, String fileName) {
		// TODO Auto-generated method stub
		
		if(mediaType.equalsIgnoreCase("mp3"))
			System.out.println("playing mp3 file -------" + fileName);
		
		else if(mediaType.equalsIgnoreCase("vlc") || mediaType.equalsIgnoreCase("mp4"))
		{
			mediaAdapter = new MediaAdapter(mediaType);
			mediaAdapter.play(mediaType, fileName);
		}
		else
		{
			System.out.println("Invalid Media : Not Supported " + mediaType);
		}

		
	}

}
