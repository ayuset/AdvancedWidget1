package id.sch.smktelkom_mlg.learn.advancedwidget1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LinearLayout llMain = (LinearLayout) findViewById(R.id.linearLayoutMain);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNama = new EditText(this);
        llMain.addView(etNama);
    }
}
