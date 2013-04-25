package org.fdroid.fdroid.views.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.fdroid.fdroid.AppListAdapter;

public class CanUpdateAppsFragment extends AppListFragment {

    @Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return createPlainAppList();
    }

    @Override
    protected AppListAdapter getAppListAdapter() {
        return getAppListManager().getCanUpdateAdapter();
    }
}
