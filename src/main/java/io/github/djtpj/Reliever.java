package io.github.djtpj;

public final class Reliever {
    private Reliever() {
        throw new IllegalStateException("Utility Class that should not be instantiated.");
    }

    public static String format(String base, Object... params) {
        String formatted = base;

        for (int i = 0; i < params.length; i++) {
            Object param = params[i];

            formatted = formatted.replaceAll("(\\$\\{" + i + "})", param.toString());
        }

        return formatted;
    }
}
