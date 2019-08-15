package com.example.franscisco.tubesuas;

import android.content.Intent;
        import android.os.Handler;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import com.example.franscisco.tubesuas.view.viewPager.IntroActivity;

        /* Tanggal Pengerjaan
       15 Agustus 2019

       Franscisco Sumpena B.A.X
       10116176
       IF-4

     */

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, IntroActivity.class));
                finish();
            }
        },2000);
    }
}
