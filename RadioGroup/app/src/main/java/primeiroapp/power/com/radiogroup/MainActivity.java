package primeiroapp.power.com.radiogroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button button;
    private TextView texto;
    private RadioButton escolhido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroupId);
        button=(Button)findViewById(R.id.btn_check);
        texto=(TextView)findViewById(R.id.textSaidaId);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checado=radioGroup.getCheckedRadioButtonId();

                if(checado!=0){
                    escolhido=(RadioButton)findViewById(checado);
                    texto.setText(escolhido.getText());

                }


               // if(R.id.radioJaponesa==checado){
                 //   texto.setText("Comida japonesa");
              //  }









            }
        });



    }
}
