package kingja.kingja_lockactivity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import kingja.kingja_lockactivity.R;
import kingja.kingja_lockactivity.service.MyService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        startService(new Intent(this, MyService.class));
    }
}
