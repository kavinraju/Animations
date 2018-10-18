package skr.developer.com.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class SlideAnimation extends AppCompatActivity {

    private ViewGroup mViewGroup;
    private Scene scene1,scene2;
    private static boolean isInfo = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_animation);

        mViewGroup = findViewById(R.id.root);
        scene1 = Scene.getSceneForLayout(mViewGroup, R.layout.scene1, this);
        scene2 = Scene.getSceneForLayout(mViewGroup, R.layout.scene2, this);

        final ImageButton imgBtn = findViewById(R.id.imgBtn);
        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (!isInfo) {
                        isInfo = true;
                        TransitionManager.go(
                                Scene.getSceneForLayout((ViewGroup) findViewById(R.id.root),
                                        R.layout.scene2,
                                        SlideAnimation.this)
                        );
                        TransitionInflater.from(SlideAnimation.this)
                                .inflateTransition(R.transition.default_to_info);
                    }else {
                        isInfo = false;
                        TransitionManager.go(
                                Scene.getSceneForLayout((ViewGroup) findViewById(R.id.root),
                                        R.layout.scene1,
                                        SlideAnimation.this)
                        );
                        TransitionInflater.from(SlideAnimation.this)
                                .inflateTransition(R.transition.default_to_info);
                    }
            }

        });
    }
}
