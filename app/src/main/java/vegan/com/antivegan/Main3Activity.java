package vegan.com.antivegan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class Main3Activity extends AppCompatActivity {
    public String bornhub = "https://www.pornhub.com/";
    public String xvideos = "https://www.xvideos.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button BornhubButton = (Button) findViewById(R.id.bornhubButton);
        BornhubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUrl(bornhub);
            }
        });
        Button XvideosButton = (Button) findViewById(R.id.xvideosButton);
        XvideosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUrl(xvideos);
            }
        });

    }
    public void openUrl(String url){
        Uri uri = Uri.parse(url); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}

