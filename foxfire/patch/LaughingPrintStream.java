package foxfire.patch;

import java.io.PrintStream;

public class LaughingPrintStream extends PrintStream {

    public LaughingPrintStream(PrintStream original) {
        super(original);
    }

    public void laugh() {
        println(
            "  🦊\n" +
                " (⚖️) Foxfire, Esq.\n" +
                " /|\\  \"Sustained.\"\n"
        );
    }

    public static void activate() {
        if (System.out instanceof LaughingPrintStream)
            return;

        System.setOut(new LaughingPrintStream(System.out));
    }
}
