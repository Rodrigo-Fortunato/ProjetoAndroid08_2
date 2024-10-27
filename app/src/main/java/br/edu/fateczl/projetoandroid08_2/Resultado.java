package br.edu.fateczl.projetoandroid08_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import br.edu.fateczl.projetoandroid08_2.model.Pessoa;

public class Resultado extends AppCompatActivity {
    /*
     *@author:<Rodrigo Fortunato Martins Neves>
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_resultado);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView tvResultado = findViewById(R.id.tvResultado);
        Button btnVoltar = findViewById(R.id.btnVoltar);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Pessoa pessoa = new Pessoa();

        pessoa.setNome(bundle.getString("Nome"));
        pessoa.setCpf(bundle.getString("Cpf"));

        tvResultado.setText(pessoa.toString() + "Local de Registro: "+ pessoa.localRegistro());

        btnVoltar.setOnClickListener(e->voltar());

    }

    private void voltar() {
        Intent i = new Intent(this,MainActivity.class);
        this.startActivity(i);
        this.finish();
    }
}