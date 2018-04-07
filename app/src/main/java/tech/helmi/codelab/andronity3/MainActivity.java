package tech.helmi.codelab.andronity3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView ivGoride,ivGoSend,ivGoMart,ivGoFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivGoride = (ImageView) findViewById(R.id.iv_goRide);
        ivGoFood = (ImageView) findViewById(R.id.iv_goFood);
        ivGoSend = (ImageView) findViewById(R.id.iv_goSend);
        ivGoMart = (ImageView) findViewById(R.id.iv_goMart);
    }

    public void PindahGoRide(View view) {
        Intent intent = new Intent(MainActivity.this, GorideActivity.class);
        startActivity(intent);
    }

    public void PindahGoSend(View view) {
        Intent intent = new Intent(MainActivity.this, GosendActivity.class);
        startActivity(intent);
    }

    public void PindahGoFood(View view) {
        Intent intent = new Intent(MainActivity.this, GofoodActivity.class);
        startActivity(intent);
    }

    public void PindahGoMart(View view) {
        Intent intent = new Intent(MainActivity.this, GomartActivity.class);
        startActivity(intent);
    }
}
