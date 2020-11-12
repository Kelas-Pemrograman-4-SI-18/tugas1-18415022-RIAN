package com.rian.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtNpm, edtNama, edtJk, edtNo, edtFakultas, edtProdi, edtAlamat;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil= (TextView) findViewById(R.id.txtNpmNamaJenisKelaminNoTelpFakultasAlamat);
        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtNama =(EditText)  findViewById(R.id.edtNama);
        edtJk =(EditText)  findViewById(R.id.edtJk);
        edtNo =(EditText)  findViewById(R.id.edtNo);
        edtFakultas =(EditText)  findViewById(R.id.edtFakultas);
        edtProdi =(EditText)  findViewById(R.id.edtProdi);
        edtAlamat =(EditText)  findViewById(R.id.edtAlamat);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strJk = edtJk.getText().toString();
                String strNo = edtNo.getText().toString();
                String strFakultas = edtFakultas.getText().toString();
                String strProdi = edtProdi.getText().toString();
                String strAlamat = edtAlamat.getText().toString();

                txtTampil.setText(strNpm + "\n" +strNama + "\n" + strJk + "\n" + strNo + "\n" + strFakultas + "\n" + strProdi + "\n" + strAlamat);
            }
        });
    }
}