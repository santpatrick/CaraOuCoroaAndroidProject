package com.projectjeivison.caraoucoroa;

import static com.projectjeivison.caraoucoroa.R.id.btnJogar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogar = findViewById(R.id.btnJogar);

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

                // Passar dados para próxima tela
                int result = new Random().nextInt(3);
                intent.putExtra("Resultado", result);

                startActivity( intent );
            }
        });

    }
}
