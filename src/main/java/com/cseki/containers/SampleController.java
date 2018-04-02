package com.cseki.containers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

import static java.lang.String.format;

@RestController
public class SampleController {

    Logger logger = LoggerFactory.getLogger(SampleController.class);
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/message")
    ContainerMessage sample(@RequestParam(value="text", defaultValue = "N/A") String text) {
        Long count = counter.incrementAndGet();
        logger.info(format("Message is received %s", text));
        return new ContainerMessage(UUID.randomUUID().toString(), text, count, LocalDateTime.now());
    }
}
