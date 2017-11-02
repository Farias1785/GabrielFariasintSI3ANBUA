package minhasanotacoes.cursoandroid.com.myaplication;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public final static String EXTRA_MESSAGE = "minhasanotacoes.cursoandroid.com.myaplication.MESSAGE";
    public final static String USER_CHOICE = "minhasanotacoes.cursoandroid.com.myaplication.NOME";

    public void sendMessage(View view){
        Intent intent = new Intent(this,DispayMessage.class);

        EditText editText = (EditText) findViewById(R.id.edit_message);
        EditText editText3 = (EditText) findViewById(R.id.id_person_choice);

        String message = editText.getText().toString();
        String choice = editText3.getText().toString();


        intent.putExtra(EXTRA_MESSAGE,message);
        intent.putExtra(USER_CHOICE,choice);

        startActivity(intent);


    }

}
