package nl.larsvelthuis.moaproject;

//Gemaakt door: Lars
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    //Imageviews aanmaken.
    ImageView lion;
    ImageView deer;
    //Variabele aanmaken voor de timer van splashscreen
    private final int SPLASH_DISPLAY_LENGTH = 3000;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Super coole material design Snackbar weergeven
        //om te laten zien dat de applicatie geladen wordt.

        Snackbar snackbar = Snackbar
                .make(getApplicationContext(), "Welcome to AndroidHive", Snackbar.LENGTH_LONG);

        //imgViews toewijzen aan de variabelen.
        lion = (ImageView) findViewById(R.id.imgLion);
        //Images toevoegen aan de imageviews.
        lion.setImageResource(R.drawable.lion);
        deer = (ImageView) findViewById(R.id.imgDeer);
        deer.setImageResource(R.drawable.deer);

        // Nieuwe Handler maken om de nieuwe activity te starten
        // Splash screen afsluiten na een paar seconden
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //intent aanmaken om de nieuwe activity te starten.
                Intent mainIntent = new Intent(MainActivity.this, Hoofdmenu.class);
                MainActivity.this.startActivity(mainIntent);
                MainActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}