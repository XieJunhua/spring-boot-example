package com.junhua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.concurrent.CompletableFuture;

/**
 * Created by xiejunhua on 2018/5/14.
 */
@Controller
public class EventController {
  public CompletableFuture<String> uploadEvent(@RequestBody byte[] body) {

    return null;

  }
}
