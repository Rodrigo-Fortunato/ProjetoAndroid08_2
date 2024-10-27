package br.edu.fateczl.projetoandroid08_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    /*
     *@author:<Rodrigo Fortunato Martins Neves>
     */

    private EditText etNomePessoa;
    private EditText etCpfPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        etNomePessoa = findViewById(R.id.etNomePessoa);
        etCpfPessoa = findViewById(R.id.etCpfPessoa);
        Button btnResultado = findViewById(R.id.btnResultado);

        btnResultado.setOnClickListener(e->{
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this,Resultado.class);

            bundle.putString("Nome",etNomePessoa.getText().toString());
            bundle.putString("Cpf",etCpfPessoa.getText().toString());


            intent.putExtras(bundle);
            this.startActivity(intent);
            this.finish();

        });





    }
}