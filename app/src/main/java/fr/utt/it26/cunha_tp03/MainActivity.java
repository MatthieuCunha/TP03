package fr.utt.it26.cunha_tp03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 *  Activité principal de l'application inutile
 *  Affiche un texte et un bouton
 */
public class MainActivity extends AppCompatActivity {

    private String message= "bonjour IF26";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tx = (TextView) findViewById(R.id.textview);
        tx.setText(this.message);

        Button bt = (Button) findViewById(R.id.colorButton);
        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tx = (TextView) findViewById(R.id.textview);
                tx.setBackgroundColor(Color.RED);
            } });

    }
}
