package primeiroapp.power.com.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoFrase;
    private TextView txtFrase;
    private List<String>frases=new ArrayList<>();






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        botaoFrase=(Button)findViewById(R.id.btn_frase);
        txtFrase=(TextView)findViewById(R.id.txt_frase);
        frases.add("A vida é minha. Mas o coração, é seu. O sorriso é meu. Mas o motivo, é você.");
        frases.add("Sabe quando você quer que um momento dure para sempre? Então, é assim quando estou com você.");
        frases.add("Não existe um dia se quer em que eu não acorde pensando em você. E quer saber? Não há pensamento melhor, se não pensar em você.");
        frases.add("Sabe o que é amor infinito? É aquele que mesmo com problemas, ciúmes, distância, inseguranças, medos, consegue crescer ainda mais a cada novo dia.");
        frases.add("Qualquer um pode te fazer sorrir. Mas nem todos podem te fazer feliz.");
        frases.add("Um dia me perguntaram .O que você viu nela e eu respondi: O que faltava em mim!.");
        frases.add("Um dia me disseram que o sorriso é uma forma de mostrarmos o quanto gostamos de alguém. Hoje me perguntaram se eu gostava de você eu apenas... sorri.");


        botaoFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r=new Random();Vi
                int Aleatorio=r.nextInt(7);

                txtFrase.setText(frases.get(Aleatorio));



            }
        });










    }
}
