package battleCruiser.alpha;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Mixer.Info;
import javax.swing.JComboBox;

public class SoundEngine {
	// singleton SoundEngine
	private static SoundEngine se;

	private SoundEngine() {

	}

	public static SoundEngine getInstance() {
		if (se == null) {
			se = new SoundEngine();
		}
		return se;
	}

	public boolean loadClip() {
		return false;

	}

	public boolean play(Clip c) {
		return false;

	}

	public void stop() {

	}

	public JComboBox mixerJCB() {
		Info i[] = AudioSystem.getMixerInfo();
		JComboBox jcb = new JComboBox();
		for (Info info : i) {
			System.out.println("Mixer Name       :" + info.getName());
			System.out.println("Mixer Description:" + info.getDescription());
			System.out.println("Mixer Vendor     :" + info.getVendor());
			System.out.println("Mixer Version    :" + info.getVersion() + "\n");
			jcb.addItem(info.getName());
		}
		return jcb;
	}

	public Info[] getMixersInfo() {
		return AudioSystem.getMixerInfo();
	}
	
}
