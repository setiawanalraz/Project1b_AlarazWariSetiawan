package vsga.mobile.project1b_alarazwarisetiawan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtAngka1, edtAngka2;
    Button btnTambah, btnKurang, btnKali, btnBagi, btnBersihkan;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtAngka1 = (EditText) findViewById(R.id.edt_angkaPertama);
        edtAngka2 = (EditText) findViewById(R.id.edt_angkaKedua);
        btnTambah = (Button) findViewById(R.id.btn_tambah);
        btnKurang = (Button) findViewById(R.id.btn_kurang);
        btnKali = (Button) findViewById(R.id.btn_kali);
        btnBagi = (Button) findViewById(R.id.btn_bagi);
        btnBersihkan = (Button) findViewById(R.id.btn_bersihkan);
        tvHasil = (TextView) findViewById(R.id.tv_hasilOperasi);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((edtAngka1.getText().length()>0) && (edtAngka2.getText().length()>0)) {
                    double angka1 = Double.parseDouble(edtAngka1.getText().toString());
                    double angka2 = Double.parseDouble(edtAngka2.getText().toString());
                    double hasil = angka1 + angka2;
                    tvHasil.setText(Double.toString(hasil));
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan " +
                            "angka pertama dan kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((edtAngka1.getText().length()>0) && (edtAngka2.getText().length()>0)) {
                    double angka1 = Double.parseDouble(edtAngka1.getText().toString());
                    double angka2 = Double.parseDouble(edtAngka2.getText().toString());
                    double hasil = angka1 - angka2;
                    tvHasil.setText(Double.toString(hasil));
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan " +
                            "angka pertama dan kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((edtAngka1.getText().length()>0) && (edtAngka2.getText().length()>0)) {
                    double angka1 = Double.parseDouble(edtAngka1.getText().toString());
                    double angka2 = Double.parseDouble(edtAngka2.getText().toString());
                    double hasil = angka1 * angka2;
                    tvHasil.setText(Double.toString(hasil));
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan " +
                            "angka pertama dan kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((edtAngka1.getText().length()>0) && (edtAngka2.getText().length()>0)) {
                    double angka1 = Double.parseDouble(edtAngka1.getText().toString());
                    double angka2 = Double.parseDouble(edtAngka2.getText().toString());
                    double hasil = angka1 / angka2;
                    tvHasil.setText(Double.toString(hasil));
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan " +
                            "angka pertama dan kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btnBersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtAngka1.setText("");
                edtAngka2.setText("");
                tvHasil.setText("0");
                edtAngka1.requestFocus();
            }
        });
    }
}