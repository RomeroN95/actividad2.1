package cl.rom.actividad21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button BTAceptar;
    private View View;
    private EditText ETNombreFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button BTAceptar =(Button) findViewById(R.id.Button);
        BTAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ETNombre=(EditText) findViewById(R.id.ETNombreFoto);
                String StNombre= ETNombre.getText().toString();

                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "El nombre de la imagen es: "+StNombre, Toast.LENGTH_SHORT);

                toast1.show();
            }

        });

    }


}