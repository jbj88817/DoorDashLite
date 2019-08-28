package us.bojie.doordashlite.data;

import android.content.Context;
import android.content.SharedPreferences;

import us.bojie.doordashlite.util.Constants;

public class SharedPrefsUtils {

    public static SharedPreferences getSharedPreference(Context context) {
        return context.getSharedPreferences(Constants.PREFERRED, Context.MODE_PRIVATE);
    }
}
