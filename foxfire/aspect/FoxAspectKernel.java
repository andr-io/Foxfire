package foxfire.aspect;

import foxfire.annotations.Foxbound;
import foxfire.guard.StackSentinel;

import java.lang.reflect.Method;

public class FoxAspectKernel extends FoxAspectCore {

    @Override
    public void weave(Object target) {
        super.weave(target); // optional: passive log first

        Class<?> cls = target.getClass();

        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Foxbound.class)) {
                Foxbound fx = method.getAnnotation(Foxbound.class);

                System.out.printf("🧶 Activating Foxbound weave → %s (guardian: %s, chaos: %s)%n",
                    method.getName(), fx.guardian(), fx.chaos());

                try {
                    if (!fx.chaos()) StackSentinel.start();
                    method.invoke(target);
                    if (!fx.chaos()) StackSentinel.end();
                } catch (Exception e) {
                    System.err.println("💥 Invocation failed: " + e.getCause());
                }
            }
        }
    }
}
