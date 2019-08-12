package mal.art.hikingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class BeginActivity extends AppCompatActivity {

    Button chooseDestinationButton;

    public void chooseDestination() {
//        Intent intent = new Intent(this, SelectDestinationActivity.class);
//        startActivity(intent);
        Log.i("Message", "Great success");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_begin);

        chooseDestinationButton = findViewById(R.id.chooseLocationButton);
        chooseDestinationButton.setBackgroundResource(0);
        chooseDestinationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseDestination();
            }
        });

    }

}
