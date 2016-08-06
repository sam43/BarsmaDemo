package example.saadat.com.barsmademo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Locale;

/**
 * Created by saadat on 7/31/2016.
 */
public class DashboardAdapter extends FragmentPagerAdapter {
    public DashboardAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                tab1 t1 = new tab1();
                return t1;
            case 1:
                tab2 t2 = new tab2();
                return t2;
            case 2:
                tab3 t3 = new tab3();
                return t3;
            case 3:
                tab2 t4 = new tab2();
                return t4;
            case 4:
                tab3 t5 = new tab3();
                return t5;

        }

        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }//set the number of tabs

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return "Members";
            case 1:

                return "Message Box";
            case 2:

                return "Blacklist";
            case 3:

                return "Expenditure";
            case 4:

                return "Complain Box";
        }
        return null;
    }
}
