package de.oose.ddd.stattauto.loggingserver.controller;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PingControllerTest {

    @Test
    public void pingReturnsPong() {
        PingController controller = new PingController();
        assertEquals("pong", controller.ping());
    }
}
