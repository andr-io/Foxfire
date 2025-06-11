package org.shadowcourt.rifts;

import java.lang.reflect.InvocationTargetException;

public class InvocationOfDoom {

    public static void cast() throws InvocationTargetException {
        System.out.println("⚖️ Forbidden invocation triggered at Lawsuit.java:666");
        throw new InvocationTargetException(new Throwable("🧨 Constructor clause breached"));
    }
}
