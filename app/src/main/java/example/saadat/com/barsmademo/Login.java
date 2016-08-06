package example.saadat.com.barsmademo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Tarana on 8/1/2016.
 */
public class Login extends Activity {

    EditText username, password;
    Button login2;
    TextView forPass;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

}
