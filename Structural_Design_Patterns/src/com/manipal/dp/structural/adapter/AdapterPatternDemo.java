package com.manipal.dp.structural.adapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "In the End.mp3");
		
		audioPlayer.play("mp4", "India's Mars Mission.mp4");
		
		audioPlayer.play("vlc", "IPL highlights.vlc");

	}

}
