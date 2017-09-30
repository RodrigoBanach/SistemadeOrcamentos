package com.sos.sistemadeorcamentos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroOrcamentos extends AppCompatActivity {

    EditText editProduto1, editDefeito1, editInformacao1, editValor;
    Button btnCadastrar2, btnCancelar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_orcamentos);


        editProduto1 = (EditText) findViewById(R.id.editProduto1);
        editDefeito1 =(EditText) findViewById(R.id.editDefeito1);
        editInformacao1 = (EditText) findViewById(R.id.editInformacao1);
        editValor = (EditText) findViewById(R.id.editValor1);

        btnCadastrar2 = (Button) findViewById(R.id.btnCadastrar2);
        btnCancelar2 = (Button) findViewById(R.id.btnCancelar2);

        btnCancelar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreCadastro = new Intent(CadastroOrcamentos.this, MainActivity.class);
                startActivity(abreCadastro);
            }
        });

        btnCadastrar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreCadastro = new Intent(CadastroOrcamentos.this, MainActivity.class);
                startActivity(abreCadastro);
            }
        });

    }


}
