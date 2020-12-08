package org.acme.getting.started;

import com.github.javafaker.Faker;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Singleton;
import javax.ws.rs.Produces;

@Singleton
public class FakerProducer {

    @Produces
    @ApplicationScoped
    public Faker faker() {
        return new Faker();
    }
}
