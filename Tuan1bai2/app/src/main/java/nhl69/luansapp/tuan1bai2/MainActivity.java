package nhl69.luansapp.tuan1bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private EditText userName, passWord;
    private Button btnLogIn;
    private ImageView logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectView();

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
               startActivity(intent);
            }
        });
    }

    private void connectView(){
        userName = (EditText) findViewById(R.id.userName);
        passWord = (EditText)  findViewById(R.id.passWord);
        btnLogIn = (Button) findViewById(R.id.login_btn);
        logo = (ImageView) findViewById(R.id.logo_login);
    }
}