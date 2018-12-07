package presentation;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SonidoThread extends Thread{
	private File file;

	public SonidoThread(File file) {
		super();
		this.file = file;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
        try {
	          // Open an audio input stream.
	          AudioInputStream audioIn = AudioSystem.getAudioInputStream(file.toURI().toURL());  
	          Clip clip = AudioSystem.getClip();
	          clip.open(audioIn);
	          clip.start();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
	
	

}
