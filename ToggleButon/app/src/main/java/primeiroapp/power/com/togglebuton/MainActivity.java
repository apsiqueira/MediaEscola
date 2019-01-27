package primeiroapp.power.com.togglebuton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton btn;
    private TextView saida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (ToggleButton) findViewById(R.id.toggleButtonid);
        saida=(TextView)findViewById(R.id.textsaida);

        btn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    saida.setText("Ligado");

                }
                else{
                    saida.setText("desligado");

                }




            }
        });



    }
}
