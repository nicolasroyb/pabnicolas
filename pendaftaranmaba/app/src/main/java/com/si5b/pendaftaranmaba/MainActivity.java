 package com.si5b.pendaftaranmaba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
    EditText etNomorPendaftaran, etnama;
    Button btndaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        etnama = findViewById(R.id.et_nama);
        btndaftar = findViewById(R.id.btn_daftar);

        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomorPendaftaran = etNomorPendaftaran.getText().toString();
                String nama = etnama.getText().toString();

                if (nomorPendaftaran.trim().equals("")){
                    etNomorPendaftaran.setError("nomor pendaftaran wajib diisi");
                }
                else if (nama.trim().equals("")){
                    etnama.setError("nama wajib diisi");
                }
                else {
                    Toast.makeText(MainActivity.this, "pendaftaran " +
                            "berhasil", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



 }