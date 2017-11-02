package matheuspimentel.androidstudio.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button descobrirIdade;
    EditText idade;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        descobrirIdade = (Button) findViewById(R.id.descobrirIdade);
        idade = (EditText) findViewById(R.id.idade);
        resultado = (TextView) findViewById(R.id.resultado);

        descobrirIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numIdade = idade.getText().toString();
                int totalIdade;

                if (numIdade.isEmpty()) {
                    resultado.setText("nenhum numero digitado!");
                } else {
                    totalIdade = Integer.parseInt(numIdade);
                    totalIdade *= 7;
                    numIdade = Integer.toString(totalIdade);
                    resultado.setText("A idade do cachorro em anos humanos é:" + numIdade);
                }
            }
        });
    }
}
