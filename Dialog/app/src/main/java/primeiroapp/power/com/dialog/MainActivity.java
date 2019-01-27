package primeiroapp.power.com.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button delete;
    private AlertDialog.Builder alert;
    private EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        delete = (Button) findViewById(R.id.btnDialog);
        texto = (EditText) findViewById(R.id.textView);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alert = new AlertDialog.Builder(MainActivity.this);

                alert.setTitle("Confimação de Exclusão");
                alert.setMessage("Deseja realmente excluir este item?");
                alert.setCancelable(false);
                alert.setIcon(android.R.drawable.ic_delete);
                alert.setNegativeButton("Não",
                        new DialogInterface.OnClickListener() {


                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                
                                Toast.makeText(getApplicationContext(), "Não Apagado", Toast.LENGTH_SHORT).show();
                                texto.setText("Obaaa não apagado");

                            }


                        });

                alert.setPositiveButton("Sim",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Apagado", Toast.LENGTH_SHORT).show();
                                texto.setText("apagadoooo");
                            }
                        }
                );
                alert.create();
                alert.show();
            }
        });
    }
}
