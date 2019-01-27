package primeiroapp.power.com.mycompany;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {
    private ImageButton imgEmpresa;
    private ImageButton imgCliente;
    private ImageButton imgServico;
    private ImageButton imgContato;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgEmpresa=(ImageButton)findViewById(R.id.Imgb_btn_empresa);
        imgCliente=(ImageButton)findViewById(R.id.img_btn_cliente);
        imgServico=(ImageButton)findViewById(R.id.img_btn_servico);
        imgContato=(ImageButton)findViewById(R.id.img_btn_contato);

        imgCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Parceiros",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),ClienteActivity.class);
                startActivity(intent);

            }
        });

        imgServico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Serviços",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(getApplicationContext(),ServicoActivity.class);
                startActivity(intent);

            }
        });


        imgContato.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Contato",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),ContatoActivity.class);
                startActivity(intent);
            }
        });



        imgEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Empresa",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), EmpresaActivity.class);
                intent.putExtra("login","Power Ranger");
                startActivity(intent);
            }

        });


    }
}
