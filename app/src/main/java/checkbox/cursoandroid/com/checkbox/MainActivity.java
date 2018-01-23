package checkbox.cursoandroid.com.checkbox;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity {

    private CheckBox checkBoxCao;
    private CheckBox checkBoxGato;
    private CheckBox checkBoxPapagaio;

    private Button botaoMostrar;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxCao = findViewById(R.id.caoId);
        checkBoxGato = findViewById(R.id.gatoId);
        checkBoxPapagaio = findViewById(R.id.papagaioId);

        textoExibicao = findViewById(R.id.textoExibicaoId);
        botaoMostrar = findViewById(R.id.botaoMostrarId);

        botaoMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itensSelecionados = "";

                itensSelecionados += "Item "+checkBoxCao.getText() + " Status: "+checkBoxCao.isChecked()+ "\n";
                itensSelecionados += "Item "+checkBoxCao.getText() + " Status: "+checkBoxGato.isChecked()+"\n";
                itensSelecionados += "Item "+checkBoxCao.getText() + " Status: "+checkBoxPapagaio.isChecked()+"\n";

                textoExibicao.setText(itensSelecionados);
            }
        });

    }
}
