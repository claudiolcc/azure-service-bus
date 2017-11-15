package com.microsoft.azure.servicebus.samples.deadletterqueue;

import org.junit.Assert;

public class DeadletterQueueTest {
    @org.junit.Test
    public void runApp() throws Exception {
        Assert.assertEquals(0,
                DeadletterQueue.runApp(new String[0], (connectionString) -> {
                    DeadletterQueue app = new DeadletterQueue();
                    try {
                        app.run(connectionString);
                        return 0;
                    } catch (Exception e) {
                        System.out.printf("%s", e.toString());
                        return 1;
                    }
                }));
    }

}