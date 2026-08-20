package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

/**
 * MainActivity - Écran principal de l'application Android Hello World
 */
public class MainActivity extends AppCompatActivity {

    private TextView textViewHello;
    private Button buttonGreet;
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Définition de la vue depuis le layout XML
        setContentView(R.layout.activity_main);

        // Liaison des vues XML avec le code Java
        textViewHello = findViewById(R.id.textViewHello);
        buttonGreet = findViewById(R.id.buttonGreet);

        // Configuration de l'action au clic sur le bouton
        buttonGreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                String message = "Hello ! (Clic #" + clickCount + ")";
                textViewHello.setText(message);
                
                // Affichage d'un message Toast éphémère
                Toast.makeText(MainActivity.this, "Hello depuis Android Java !", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
