package uit.lab2.bt5_18520771;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnSend);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //distance
                String url = "http://maps.google.com/maps?"+ "saddr=9.938083,-84.054430&daddr=9.926392,-84.055964";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}

//send email
//    Intent intent = new Intent(Intent.ACTION_SEND);
//                intent.setType("message/rfc822");
//                        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"myhoan2805@gmail.com"});
//                        intent.putExtra(Intent.EXTRA_SUBJECT, "Hello Bee");
//                        intent.putExtra(Intent.EXTRA_TEXT, "You are an apple in my eyes");
//                        startActivity(Intent.createChooser(intent,"Choose Mail App"));