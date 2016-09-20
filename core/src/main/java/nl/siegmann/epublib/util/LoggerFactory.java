package nl.siegmann.epublib.util;

/**
 * Created by Vithorio Polten on 20/09/16.
 */

public class LoggerFactory {

    public static Logger getLogger(Class<?> clasz) {
        return new Logger(clasz.getSimpleName(), clasz.getCanonicalName());
    }
}

