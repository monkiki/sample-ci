package org.monkiki.controller;

import org.monkiki.bean.Sample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pavila on 17/06/16.
 */
@RestController
@RequestMapping("/api/sample")
public class SampleController {
    private static Logger log = LoggerFactory.getLogger(SampleController.class);

    @GetMapping
    List<Sample> findAll() {
        log.debug("findAll");
        List<Sample> list = new ArrayList<>();
        list.add(new Sample(0, "cero"));
        list.add(new Sample(1, "uno"));
        list.add(new Sample(2, "dos"));
        return list;
    }

    @GetMapping("/{id}")
    Sample findById(@PathVariable("id") String id) {
        log.debug("findById: {}", id);
        return new Sample(0, id);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleNotFound(Exception ex) {
        System.out.println("Not found");
    }
}
