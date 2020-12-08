package com.friendship.generator;

import com.github.javafaker.Faker;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class FriendshipService {

    @Inject
    Faker faker;

    public Friend generate() {
        return new Friend(faker.name().fullName(), faker.address().fullAddress());
    }

}
