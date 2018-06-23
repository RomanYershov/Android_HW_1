package kz.exampleandroid.tom.hw_1_android;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class Activity_Second extends AppCompatActivity {
    private final static String TAG = Activity_Second.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__second);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "************ onStart **********");
    }
}
