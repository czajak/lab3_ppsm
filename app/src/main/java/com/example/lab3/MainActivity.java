package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button button;
    String[] jokesPL;
    String[] jokesEN;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jokesPL = new String[]{"Jak wita się mleko? \nMlekovita.",
                "Co robi elektryk na scenie? \nBuduje napięcie.",
                "Jaka dziewczyna najczęściej kopie swoje ciuchy? \nKopciuszek.",
                "Co mówi kartka do kartki? \nStary, chyba cię pogieło!",
                "Jaki jest ulubiony owoc żołnierza? \nGranat."};
        jokesEN = new String[]{"How do you make holy water? \nYou boil the hell out of it.",
                "What do prisoners use to call each other? \nCell phones!",
                "How does Moses make his tea?\nHebrews it!",
                "Why don’t crabs donate?\nBecause they’re shellfish.",
                "Why did Adele cross the road?\nTo say hello from the other side."};
        tv = findViewById(R.id.jokes_go_here);
        button = findViewById(R.id.generate_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Random rand = new Random();
                int randomNumber = rand.nextInt(5);
                if(Locale.getDefault().getLanguage() == "pl")
                {
                    tv.setText(jokesPL[randomNumber]);
                }
                else
                {
                    tv.setText(jokesEN[randomNumber]);
                }
            }
        });
    }
}