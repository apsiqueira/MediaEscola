package primeiroapp.power.com.a7signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView apresentacaoSignos;
    private String[] signus={"Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes"};
    private int [] signusNum={0,1,2,3,4,5,6,7,8,9,10,11};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apresentacaoSignos= (ListView) findViewById(R.id.listSignos);

        ArrayAdapter <String> adapter=new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,

                signus

        );
        apresentacaoSignos.setAdapter(adapter);
        apresentacaoSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"posição "+signusNum[position],Toast.LENGTH_SHORT).show();
            }
        });



    }
}
