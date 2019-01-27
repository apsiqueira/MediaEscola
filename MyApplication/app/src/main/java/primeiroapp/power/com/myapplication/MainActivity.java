package primeiroapp.power.com.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ListView lista_frotas;
    ArrayList<String>frotas=new ArrayList<String>();
    private Button btnCadastrarFrotaId;
    private EditText textoFrotaId;
    ArrayAdapter<String>adpter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista_frotas= (ListView) findViewById(R.id.listaTela);
        btnCadastrarFrotaId= (Button) findViewById(R.id.btn_adicionar);
        textoFrotaId= (EditText) findViewById(R.id.txt_frota);


         this.adpter=new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                frotas
        );





        lista_frotas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Placa "+lista_frotas.getItemAtPosition(position),Toast.LENGTH_SHORT).show();
            }
        });
        btnCadastrarFrotaId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String frotaAdd=textoFrotaId.getText().toString();
                if(frotaAdd.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Nenhuma Frota Inserida",Toast.LENGTH_SHORT).show();

                }
                else if(frotaAdd.length()>=5){

                    Toast.makeText(getApplicationContext(),"Frota com maximo de digitos ",Toast.LENGTH_SHORT).show();

                }
                else{

                    frotas.add(frotaAdd);
                    lista_frotas.setAdapter(adpter);


                }



            }
        });






    }
}
