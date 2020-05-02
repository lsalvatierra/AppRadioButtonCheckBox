package idat.edu.pe.appradiobuttoncheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    RadioButton rbtnMujer, rbtnVaron, rbtnOtro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        rbtnMujer = findViewById(R.id.rbtnMujer);
        rbtnVaron = findViewById(R.id.rbtnVaron);
        rbtnOtro = findViewById(R.id.rbtnOtro);
        rbtnMujer.setOnClickListener(this);
        rbtnVaron.setOnClickListener(this);
        rbtnOtro.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rbtnMujer:
                Toast.makeText(getApplicationContext(),"Se ha seleccionado Mujer",Toast.LENGTH_LONG).show();
                break;
            case R.id.rbtnVaron:
                Toast.makeText(getApplicationContext(),"Se ha seleccionado Hombre",Toast.LENGTH_LONG).show();
                break;
            case R.id.rbtnOtro:
                Toast.makeText(getApplicationContext(),"Se ha seleccionado Indefinido",Toast.LENGTH_LONG).show();
                break;
        }

    }
}
