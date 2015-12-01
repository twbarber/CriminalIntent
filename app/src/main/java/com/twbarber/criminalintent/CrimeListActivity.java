package com.twbarber.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by tyler on 11/30/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}
