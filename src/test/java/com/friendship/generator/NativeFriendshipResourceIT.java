package com.friendship.generator;

import io.quarkus.test.junit.NativeImageTest;
import org.junit.jupiter.api.Disabled;

@NativeImageTest
@Disabled
public class NativeFriendshipResourceIT extends FriendshipResourceTest {

    // Execute the same tests but in native mode.
}
