package androidx.core.p003os;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Message;
import androidx.annotation.NonNull;

/* renamed from: androidx.core.os.MessageCompat */
public final class MessageCompat {
    private static boolean sTryIsAsynchronous = true;
    private static boolean sTrySetAsynchronous = true;

    @SuppressLint({"NewApi"})
    public static void setAsynchronous(@NonNull Message message, boolean async) {
        if (VERSION.SDK_INT >= 22) {
            message.setAsynchronous(async);
            return;
        }
        if (sTrySetAsynchronous && VERSION.SDK_INT >= 16) {
            try {
                message.setAsynchronous(async);
            } catch (NoSuchMethodError e) {
                sTrySetAsynchronous = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public static boolean isAsynchronous(@NonNull Message message) {
        if (VERSION.SDK_INT >= 22) {
            return message.isAsynchronous();
        }
        if (sTryIsAsynchronous && VERSION.SDK_INT >= 16) {
            try {
                return message.isAsynchronous();
            } catch (NoSuchMethodError e) {
                sTryIsAsynchronous = false;
            }
        }
        return false;
    }

    private MessageCompat() {
    }
}
