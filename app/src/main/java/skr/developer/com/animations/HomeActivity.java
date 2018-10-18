package skr.developer.com.animations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSlideAnimation, btnActivityAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnSlideAnimation = findViewById(R.id.btnSlideAnimation);
        btnActivityAnimation = findViewById(R.id.btnActivityAnimation);

        btnSlideAnimation.setOnClickListener(this);
        btnActivityAnimation.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSlideAnimation:
                startActivity(new Intent(this,SlideAnimation.class));
                break;
            case R.id.btnActivityAnimation:

                break;
        }
    }
}
