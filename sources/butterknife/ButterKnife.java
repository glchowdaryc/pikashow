package butterknife;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ButterKnife {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static final Map<Class<?>, Constructor<? extends Unbinder>> f19577Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new LinkedHashMap();

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public static boolean f6969Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    public static Constructor<? extends Unbinder> Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Class<?> cls) {
        Constructor<? extends Unbinder> constructor;
        Map<Class<?>, Constructor<? extends Unbinder>> map = f19577Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        Constructor<? extends Unbinder> constructor2 = map.get(cls);
        if (constructor2 != null || map.containsKey(cls)) {
            if (f6969Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                Log.d("ButterKnife", "HIT: Cached in binding map.");
            }
            return constructor2;
        }
        String name = cls.getName();
        if (!name.startsWith("android.") && !name.startsWith("java.") && !name.startsWith("androidx.")) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                constructor = classLoader.loadClass(name + "_ViewBinding").getConstructor(new Class[]{cls, View.class});
                if (f6969Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    Log.d("ButterKnife", "HIT: Loaded binding class and constructor.");
                }
            } catch (ClassNotFoundException unused) {
                if (f6969Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    Log.d("ButterKnife", "Not found. Trying superclass " + cls.getSuperclass().getName());
                }
                constructor = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(cls.getSuperclass());
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Unable to find binding constructor for " + name, e);
            }
            f19577Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put(cls, constructor);
            return constructor;
        } else if (!f6969Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            return null;
        } else {
            Log.d("ButterKnife", "MISS: Reached framework class. Abandoning search.");
            return null;
        }
    }

    public static Unbinder Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Object obj, View view) {
        Class<?> cls = obj.getClass();
        if (f6969Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            Log.d("ButterKnife", "Looking up binding for " + cls.getName());
        }
        Constructor<? extends Unbinder> Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(cls);
        if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 == null) {
            return Unbinder.f19586Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }
        try {
            return (Unbinder) Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2.newInstance(new Object[]{obj, view});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unable to invoke " + Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Unable to invoke " + Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2, e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unable to create binding instance.", cause);
            }
        }
    }

    public static Unbinder Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Activity activity) {
        return Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(activity, activity.getWindow().getDecorView());
    }
}
