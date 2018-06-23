package kz.exampleandroid.tom.hw_1_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;




public class MainActivity extends AppCompatActivity {
    private final static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.ma_showsecondact_btn);
        button.setOnClickListener(view -> {
            Log.i(TAG, "******** button pressed **********");
            Intent intent = new Intent(getApplicationContext(), Activity_Second.class);
            startActivity(intent);
        });

    }



}
