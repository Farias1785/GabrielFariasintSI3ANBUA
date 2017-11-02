package minhasanotacoes.cursoandroid.com.myaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DispayMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispay_message);
        Intent intent = getIntent();

        String message =
                intent.getExtras().getString(MainActivity.EXTRA_MESSAGE);
        String choice  =
                intent.getExtras().getString(MainActivity.USER_CHOICE);

        TextView textView = new TextView(this);
        textView.setTextSize(25);
        textView.setText("Bem vindo(a)"+message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        ListView lista = (ListView)findViewById(R.id.listView);

        ArrayList<String> livros=preencherDados(choice);
        ArrayAdapter<String> ArrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked,livros);
        lista.setAdapter(ArrayAdapter);

        layout.addView(textView);

    }


    ArrayList<String> preencherDados(String choice) {
        Log.i("My tag choice",choice);
        ArrayList<String> dados = new ArrayList<String>();
        if (choice.equals("Técnico")) {
            dados.add("BlueJ avançado");
            dados.add("Concrete Mathematics");
            dados.add("The C++ Programming Language");
        } else if(choice.equals("Literatura")){
            dados.add("O Hobbit");
            dados.add("O senhor dos aneis");
            dados.add("As cronicas de Narnia");
        }else{
            dados.add("Nenhm Livro cadastrado na categoria:"+" "+choice);
        }
        return dados;
    }

}
