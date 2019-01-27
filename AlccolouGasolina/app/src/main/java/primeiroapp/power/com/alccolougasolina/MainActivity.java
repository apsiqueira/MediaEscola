package primeiroapp.power.com.alccolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText vAlcool;
    private EditText vGssolina;
    private Button calcularMelhor;
    private TextView mostraResultado;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         vAlcool=(EditText)findViewById(R.id.valorAlcoolid);
         vGssolina=(EditText)findViewById(R.id.valorGasolinaid);
         calcularMelhor=(Button) findViewById(R.id.btn_calcular);
         mostraResultado=(TextView) findViewById(R.id.btn_calcular);


        mostraResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double precoGasolina=Double.parseDouble((vGssolina.getText().toString());
                double precoAlcool=Double.parseDouble(vAlcool.getText().toString());



                if(precoAlcool/precoGasolina<7){
                    mostraResultado.setText("Ideal usar o Alcool");


                }
                else {
                    mostraResultado.setText("Ideal usar Gasolina");


                }



            }




            });


        }
}
