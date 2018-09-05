package com.example.shootingstars.appcategorias;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText idade, nome;
    private TextView ver_categoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = findViewById(R.id.editTextNome);
        idade = findViewById(R.id.editTextIdade);
        ver_categoria = findViewById(R.id.textViewInforma);
    }

    public void onClique(View view){

        String pega_nome = nome.getText().toString();
        String pega_idade = idade.getText().toString();

        if (view.getId() == R.id.botaoVerificar){

            int number_idade = Integer.parseInt(pega_idade);

            if (number_idade <8){

                ver_categoria.setText(pega_nome + " Idade muito baixa");
            }

            else if (number_idade >= 8 && number_idade <= 12){

                ver_categoria.setText(pega_nome + " Vai entrar para a categoria Infantil");
            }

            else if (number_idade >= 13 && number_idade <= 17){

                ver_categoria.setText(pega_nome + " Vai entrar para a categoria Juvenil");
            }

            else if (number_idade >= 18){

                ver_categoria.setText(pega_nome + " Vai entrar para a categoria Adulta");
            }
        }
    }
}
