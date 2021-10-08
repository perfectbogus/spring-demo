package dev.perfectbogus.demo.controllers;

import dev.perfectbogus.demo.domain.DemoEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @GetMapping("/demo")
    @ResponseBody
    public ResponseEntity<DemoEntity> getDemo(){
        DemoEntity demo = new DemoEntity();
        demo.setName("lalo");
        return ResponseEntity.ok(demo);
    }

}
