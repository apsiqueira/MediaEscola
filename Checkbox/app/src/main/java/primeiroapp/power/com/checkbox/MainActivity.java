package primeiroapp.power.com.checkbox;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button btnOk;
    private CheckBox caixaGato;
    private CheckBox caixaCao;
    private CheckBox caixaPeixe;
    private TextView saida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        caixaCao= (CheckBox) findViewById(R.id.checkBoxCachorro);
        caixaGato= (CheckBox) findViewById(R.id.checkBoxGato);
        caixaPeixe= (CheckBox) findViewById(R.id.checkBoxPeixe);
        btnOk=(Button)findViewById(R.id.btnOK);
        saida= (TextView) findViewById(R.id.textViewSaida);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String apresenta="";

                     apresenta += "Gato :" + caixaGato.getText()+ "  Status :"+caixaGato.isChecked()+"\n";



                     apresenta += "Cao :" + caixaCao.getText()+ "  Status :"+caixaCao.isChecked()+"\n";



                     apresenta += "Peixe :" + caixaPeixe.getText()+"  Status  :"+caixaPeixe.isChecked()+"\n";




                saida.setText(apresenta);







            }




        });




    }
}
