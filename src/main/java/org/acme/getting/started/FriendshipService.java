package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FriendshipService {

    public Friend generate(String name) {
        String address = "123 Imagination Road";
        return new Friend(name, address);
    }

}
