package primeiroapp.power.com.alcoolougasolinav2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText vAlcool;
    private EditText vGasolina;
    private Button btnCalcular;
    private TextView resultTela;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vAlcool= (EditText) findViewById(R.id.valorAlcoolTela);
        vGasolina= (EditText) findViewById(R.id.valorGasolinaTela);
        btnCalcular= (Button) findViewById(R.id.btn_calculo);
        resultTela= (TextView) findViewById(R.id.txtResultadoTela);


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String vAlcoolTemp = vAlcool.getText().toString();
                String vGasolinaTemp = vGasolina.getText().toString();


                if (vAlcoolTemp.isEmpty() || vGasolinaTemp.isEmpty()) {
                    resultTela.setText("Todos os valores devem ser preenchidos");


                } else {
                    double vA = Double.parseDouble(vAlcool.getText().toString());
                    double vG = Double.parseDouble(vGasolina.getText().toString());

                    if (vA / vG > 0.7) {

                        resultTela.setText("Melhor abastecer com Gasolina");
                    } else resultTela.setText("Melhor abastecer com Alcool");
                }

            }




        });


    }
}
