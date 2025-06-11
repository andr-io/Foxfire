package foxfire.aspect;

import java.lang.reflect.Method;
import foxfire.annotations.Foxbound;

public class FoxAspectCore {

    public void weave(Object target) {
        Class<?> cls = target.getClass();

        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Foxbound.class)) {
                Foxbound foxbound = method.getAnnotation(Foxbound.class);
                System.out.printf("🛡️ Weaving @Foxbound: method=%s, guardian=%s, chaos=%s%n",
                    method.getName(),
                    foxbound.guardian(),
                    foxbound.chaos()
                );
            }
        }
    }
}
