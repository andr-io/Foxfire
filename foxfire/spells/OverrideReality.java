package foxfire.spells;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class OverrideReality {

    public static void defyFinalStatic(Class<?> clazz, String fieldName, Object newValue) throws Exception {
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);

        Field modifiers = Field.class.getDeclaredField("modifiers");
        modifiers.setAccessible(true);
        modifiers.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        field.set(null, newValue);
        System.out.println("🛠️ FINAL STATIC value overridden. Reality is... negotiable.");
    }
}
