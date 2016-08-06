package example.saadat.com.barsmademo;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;

/**
 * Created by Tarana on 8/2/2016.
 */
public class HomeWeb extends Activity {

    //WebView mWebView = null;
    //ProgressBar progressbar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homeweb);

        String myUrl = "http://www.barsma.com/";

        WebView myWebView = (WebView) this.findViewById(R.id.home);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl(myUrl);
    }
}
