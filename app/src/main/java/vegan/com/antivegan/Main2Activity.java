package vegan.com.antivegan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main2Activity extends AppCompatActivity {
    public String BentaiHaven = "http://hentaihaven.org";
    public String Nbentai = "http://nhentai.net/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button urlButton = (Button) findViewById(R.id.button);
        Button nbentaiButton = (Button) findViewById(R.id.button2);

        nbentaiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUrl(Nbentai);
            }
        });
        urlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUrl(BentaiHaven);
            }
        });
    }

    public void openUrl(String url){
        Uri uri = Uri.parse(url); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
