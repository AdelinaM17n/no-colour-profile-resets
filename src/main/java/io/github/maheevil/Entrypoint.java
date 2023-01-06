package io.github.maheevil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("unused")
public class Entrypoint
{
    public static final Logger LOGGER = LogManager.getLogger();

    public static void initialize() {
        LOGGER.info("NoColourProfileResets - I lied, resetting all your colour profiles");
    }
}
