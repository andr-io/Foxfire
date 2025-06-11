package foxfire.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Foxbound {

    // Name of the guardian spirit watching over this method
    String guardian() default "🦊";

    // A narrative or functional description of why this method is bound
    String intent() default "Protect arcane logic";

    // Optional toggle to indicate chaotic or non-deterministic behavior
    boolean chaos() default false;
}
