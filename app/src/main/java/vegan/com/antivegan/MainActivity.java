package vegan.com.antivegan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bentai_button = (Button) findViewById(R.id.bentai_button);
        Button born_button = (Button) findViewById(R.id.born_button);

        bentai_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(Main2Activity.class);
            }
        });

        born_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(Main3Activity.class);
            }
        });
    }

    public void openActivity(Class Class) {
        Intent intent = new Intent(this, Class);
        startActivity(intent);

    }
}
