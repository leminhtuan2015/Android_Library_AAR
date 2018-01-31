package library.test.mainproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import library.test.testaar.TestAAR;
import library.test.testaar_1.TestAAR1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new TestAAR().hello();
        new TestAAR1().hello();
    }
}
