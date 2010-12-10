package battleCruiser.alpha;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class Alpha extends Activity {
	private GLSurfaceView mainView;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainView = new GLSurfaceView(this);
        mainView.setRenderer(new BattleRender());
        //mainView.queueEvent(r);
        setContentView(R.layout.main);
    }
    public void onPause(){
    	//TODO
    	super.onPause();
    }
    public void onResume(){
    	//TODO
    	super.onResume();
    }
}