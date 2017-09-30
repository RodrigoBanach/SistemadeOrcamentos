package com.sos.sistemadeorcamentos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroClientes extends AppCompatActivity {

    EditText editNome1, editCPF1, editTelefone1, editEmail1, editRedesocial1, editWhatsapp;
    Button btnCadastrar, btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_clientes);

        editNome1 = (EditText)findViewById(R.id.editNome1);
        editCPF1 = (EditText) findViewById(R.id.editCPF1);
        editTelefone1 = (EditText) findViewById(R.id.editTelefone1);
        editEmail1 = (EditText) findViewById(R.id.editEmail1);
        editRedesocial1 = (EditText) findViewById(R.id.editRedesocial1);
        editWhatsapp = (EditText) findViewById(R.id.editWhatsapp1);

        btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
        btnCancelar = (Button) findViewById(R.id.btnCancelar);

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreCadastro = new Intent(CadastroClientes.this, CadastroOrcamentos.class);
                startActivity(abreCadastro);
            }
        });
    }
}
