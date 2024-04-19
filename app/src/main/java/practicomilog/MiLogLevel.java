package main.java.practicomilog;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MiLogLevel {
    final Level VERBOSE = Level.forName("VERBOSE", 550);
    protected final Logger logger = LogManager.getLogger();

}