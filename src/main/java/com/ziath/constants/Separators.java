package com.ziath.constants;

public enum Separators {
    COMMA_SEPARATOR(','),
    PIPE_SEPARATOR('|'),
    TAB_SEPARATOR('	');

    private char separator;

    public char getSeparator() {
        return this.separator;
    }

    Separators(char separator) {
        this.separator = separator;
    }
}
