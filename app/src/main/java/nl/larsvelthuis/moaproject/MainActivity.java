package nl.larsvelthuis.moaproject;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.os.Handler;
/* gemaakt door: Lars
   datum: 13-11-2015
 */
public class MainActivity extends AppCompatActivity {

    //Imageviews aanmaken.
    ImageView lion;
    ImageView deer;
    ImageView logo;
    //Variabele aanmaken voor de timer van splashscreen
    private final int splashLength = 3000;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //imgViews variabelen toewijzen aan de imgviews.
        lion = (ImageView) findViewById(R.id.imgLion);
        deer = (ImageView) findViewById(R.id.imgDeer);
        logo = (ImageView) findViewById(R.id.imgLogo);
        //Images toevoegen aan de imageviews.
        lion.setImageResource(R.drawable.lion);
        deer.setImageResource(R.drawable.deer);
        logo.setImageResource(R.drawable.logo);

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
        }, splashLength);
    }
}