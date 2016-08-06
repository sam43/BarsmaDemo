package example.saadat.com.barsmademo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Saadat on 8/1/2016.
 */
public class Register extends Activity {

    EditText etname1, etname2 ,etname3, etdeg1,etdeg2,etdeg3, etCom, etEmail, etPhn,etFax,etAdd,
            etCity,etZip,etEmail2,etPhn2,etFax2,etAdd2,etcity2,etZip2,etLicNum,etTin,etpass;
    Button choose1,choose2,choose3,choose4,breg2,bclose;
    String name1, name2 ,name3, deg1,deg2,deg3, Com, Email, Phn,Fax,Add,City,Zip,Email2,Phn2,Fax2,
            Add2,city2,Zip2,LicNum,Tin,pass;
    Context ctx = this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }

}
