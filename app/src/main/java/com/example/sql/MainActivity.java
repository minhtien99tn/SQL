package com.example.sql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edthoTen, edtnamSinh, edtLop;
    RadioButton rdnam, rdnu;
    CheckBox cbtheThao, cbdocSach, cbduLich;
    Button btNhap, btNhapLai;
    SinhVienDataBase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edthoTen = findViewById(R.id.edthoTen);
        edtnamSinh =findViewById(R.id.edtnamSinh);
        edtLop = findViewById(R.id.edtLop);

        rdnam = findViewById(R.id.rdnam);
        rdnu = findViewById(R.id.rdnu);

        cbdocSach = findViewById(R.id.cbdocSach);
        cbtheThao = findViewById(R.id.cbtheThao);
        cbduLich = findViewById(R.id.cbduLich);

        btNhapLai = findViewById(R.id.btNhapLai);
        btNhap = findViewById(R.id.btNhap);
        db = new SinhVienDataBase(this);

        btNhapLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edthoTen.setText("");
                edtnamSinh.setText("");
                edtLop.setText("");
                rdnam.setChecked(true);
                cbdocSach.setChecked(false);
                cbduLich.setChecked(false);
                cbtheThao.setChecked(false);
            }
        });
        btNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int gt = 0;
                String  sothich = "";
                String hoTen = edthoTen.getText().toString();
                String namSinh = edtnamSinh.getText().toString();
                String Lop = edtLop.getText().toString();
                if(rdnu.isChecked()){
                    gt = 1;
                }
                if( cbtheThao.isChecked()){
                    sothich +=","+cbtheThao.getText().toString();
                }
                if (cbduLich.isChecked()){
                    sothich +=","+cbduLich.getText().toString();
                }
                if (cbdocSach.isChecked()){
                    sothich +=","+cbdocSach.getText().toString();
                }
                SinhVienModel svThem = new SinhVienModel(hoTen,namSinh,Lop,sothich,gt);
                if (svThem != null){
                    db.themsinhvien(svThem);
                    Toast.makeText(MainActivity.this, "Ban da them thanh cong! ", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
