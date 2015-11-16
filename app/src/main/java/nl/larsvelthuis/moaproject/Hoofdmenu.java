package nl.larsvelthuis.moaproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/* gemaakt door: Lars
   datum: 16-11-2015
 */
public class Hoofdmenu extends AppCompatActivity {
    //Imageviews aanmaken.
    ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoofdmenu);
        //imgViews variabelen toewijzen aan de imgviews.
        logo = (ImageView)findViewById(R.id.imgLogo);

        //plaatje toevoegen aan de imageview
        logo.setImageResource(R.drawable.logo);
    }
    //Methode exitApp aanmaken. Sluit de applicatie af.
    public void exitApp(View v)
    {
        //alertdialog aanmaken die aan de gebruiker vraagt of hij/zij
        //echt af wilt sluiten
        AlertDialog.Builder dialog = new AlertDialog.Builder(Hoofdmenu.this);
        dialog.setMessage("Close the application?");
        dialog.setPositiveButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //gebruiker klikte op cancel.
                return;
            }
        });
        dialog.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //gebruiker klikte op ok, dus applicatie afsluiten.
                        System.exit(0);
                    }

                });
        //alertdialog
        dialog.show();
    }

    public void newGame()
    {

    }
}
