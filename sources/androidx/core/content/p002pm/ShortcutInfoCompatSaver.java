package androidx.core.content.p002pm;

import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.content.pm.ShortcutInfoCompatSaver */
public abstract class ShortcutInfoCompatSaver<T> {

    @RestrictTo({Scope.LIBRARY})
    /* renamed from: androidx.core.content.pm.ShortcutInfoCompatSaver$NoopImpl */
    public static class NoopImpl extends ShortcutInfoCompatSaver<Void> {
        public Void addShortcuts(List<ShortcutInfoCompat> list) {
            return null;
        }

        public Void removeShortcuts(List<String> list) {
            return null;
        }

        public Void removeAllShortcuts() {
            return null;
        }
    }

    @AnyThread
    public abstract T addShortcuts(List<ShortcutInfoCompat> list);

    @AnyThread
    public abstract T removeAllShortcuts();

    @AnyThread
    public abstract T removeShortcuts(List<String> list);

    @WorkerThread
    public List<ShortcutInfoCompat> getShortcuts() throws Exception {
        return new ArrayList();
    }
}
