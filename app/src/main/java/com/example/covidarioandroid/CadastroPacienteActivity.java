package com.example.covidarioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.covidarioandroid.model.Paciente;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CadastroPacienteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_paciente);

        Button buttonSalvar = findViewById(R.id.buttonSalvar);
        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Paciente paciente = new Paciente();

                EditText personName = findViewById(R.id.editTextPersonName);
                paciente.setNome(personName.getText().toString());
                personName.setText("");

                EditText dataNascimento = findViewById(R.id.editTextDate);
                try {
                    paciente.setData(new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento.getText().toString()));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                dataNascimento.setText("");

                EditText dataAtual = findViewById((R.id.editTextDateatual));
                try {
                    paciente.setDataAtual(new SimpleDateFormat("dd/MM/yyyy").parse(dataAtual.getText().toString()));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                dataAtual.setText("");

                EditText lugares = findViewById(R.id.editTextTextMultiLineLugares);
                paciente.setLugares(lugares.getText().toString());
                lugares.setText("");

                Toast.makeText(CadastroPacienteActivity.this, "Seus dados foram salvos com sucesso", Toast.LENGTH_LONG).show();
                }
        });
    }
}