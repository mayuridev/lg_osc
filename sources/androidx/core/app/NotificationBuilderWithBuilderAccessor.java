package androidx.core.app;

import android.app.Notification.Builder;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public interface NotificationBuilderWithBuilderAccessor {
    Builder getBuilder();
}
