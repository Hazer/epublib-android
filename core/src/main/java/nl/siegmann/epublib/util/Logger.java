package nl.siegmann.epublib.util;

import android.util.Log;

public class Logger {
    final private String simpleName;
    final private String canonicalName;

    final static private String tag = "ePubLib-";

    public Logger(String simpleName, String canonicalName) {
        this.simpleName = simpleName;
        this.canonicalName = canonicalName;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public String getCanonicalName() {
        return canonicalName;
    }

    public void error(String message, Exception e) {
        Log.e(tag + simpleName, message, e);
    }

    public void debug(String message) {
        Log.d(tag + simpleName, message);
    }

    public void error(String message) {
        Log.e(tag + simpleName, message);
    }
}
