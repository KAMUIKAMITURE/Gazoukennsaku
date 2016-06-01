package com.lifeistech.android.gazoukennsaku;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        Uri uri = Uri.parse("https://flowerillust.com/img/flower/flower-back0622.jpg?");
        Uri.Builder builder = uri.buildUpon();
        AsyncTaskHttpRequest task = new AsyncTaskHttpRequest(imageView);
        task.execute(builder);

    }
}
