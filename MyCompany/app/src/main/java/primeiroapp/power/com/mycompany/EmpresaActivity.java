package primeiroapp.power.com.mycompany;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EmpresaActivity extends Activity {

    private TextView txtRecebido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa);

        txtRecebido=(TextView)findViewById(R.id.txtReuperado);
        Bundle texto =getIntent().getExtras();

        if(texto !=null) {
            String extrasRecebido = texto.getString("login");
            txtRecebido.setText(extrasRecebido);

        }
        else{
            txtRecebido.setText("Invalido");



        }



    }
}
