package br.com.franciscochaves.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBotaoMensagemCurta;
    private Button mBotaoMensagemLonga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBotaoMensagemCurta = findViewById(R.id.button_mensagem_curta);
        mBotaoMensagemLonga = findViewById(R.id.button_mensagem_longa);

        mBotaoMensagemCurta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Mensagem Curta", Toast.LENGTH_SHORT).show();
            }
        });

        mBotaoMensagemLonga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Mensagem Longa", Toast.LENGTH_LONG).show();
            }
        });
    }
}
