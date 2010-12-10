package battleCruiser.alpha;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLSurfaceView.Renderer;

public class BattleRender implements Renderer {
	public BattleRender(){
		new Model();
	}
	@Override
	public void onDrawFrame(GL10 gl) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSurfaceChanged(GL10 gl, int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig config) {
		// TODO Create/load Required resources: required as in whats is currently loaded

	}

}
