package battleCruiser.alpha;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Mixer.Info;

public class SoundEngine {
	public SoundEngine(){
		Info i[] = AudioSystem.getMixerInfo();
		for(Info info:i){
			System.out.println("Mixer: "+info);
		}
	}
	public boolean loadClip(){
		return false;
		
	}
	public boolean play(Clip c){
		return false;
		
	}
	public void stop(){
		
	}
	
}
