package androidx.core.p003os;

import android.os.Build.VERSION;
import android.os.Trace;
import androidx.annotation.NonNull;

/* renamed from: androidx.core.os.TraceCompat */
public final class TraceCompat {
    public static void beginSection(@NonNull String sectionName) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(sectionName);
        }
    }

    public static void endSection() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    private TraceCompat() {
    }
}
