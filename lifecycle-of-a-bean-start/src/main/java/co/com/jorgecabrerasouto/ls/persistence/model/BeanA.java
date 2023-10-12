package co.com.jorgecabrerasouto.ls.persistence.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.annotation.PostConstruct;

public class BeanA {

    private static Logger log = LoggerFactory.getLogger(BeanA.class);

    @PostConstruct
    public void post() {
        log.info("@PostConstruct annotated method is called.");
    }
}
