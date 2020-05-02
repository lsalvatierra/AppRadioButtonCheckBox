package idat.edu.pe.appradiobuttoncheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox chkDeporte , chkVideojuegos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkDeporte = findViewById(R.id.chkDeporte);
        chkVideojuegos = findViewById(R.id.chkVideoJuego);
        chkDeporte.setOnClickListener(this);
        chkVideojuegos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        CheckBox chk = null;
        boolean checkeado = false;
        switch (v.getId()){
            case R.id.chkDeporte:
                chk = (CheckBox)v;
                checkeado = chk.isChecked();
                if(checkeado){
                    Toast.makeText(getApplicationContext(), "Se ha marcado deporte", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Se ha desmarcado deporte", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.chkVideoJuego:
                chk  = (CheckBox)v;
                checkeado = chk.isChecked();
                if(checkeado){
                    Toast.makeText(getApplicationContext(), "Se ha marcado videojuegos", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Se ha desmarcado videojuegos", Toast.LENGTH_LONG).show();
                }
                break;
            default:
                Toast.makeText(getApplicationContext(), "Error!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
