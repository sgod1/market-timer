package io.szesto.markettimer.markettimer.controllers;

import io.szesto.markettimer.markettimer.services.Greeting;
import io.szesto.markettimer.markettimer.services.GreetingsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/greetings")
class GreetingsController {
    private final GreetingsService greetingsService;

    public GreetingsController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    @GetMapping
    public List<Greeting> getGreetings() {
        return greetingsService.getGreetings();
    }

    @GetMapping("/{greetingId}")
    public Optional<Greeting> getGreetingById(@PathVariable String greetingId) {
        return greetingsService.getGreetingById(greetingId);
    }

    @PostMapping
    public ResponseEntity<String> newGreeting(@RequestBody Greeting greeting) {
        String greetingId = greetingsService.newGreeting(greeting);
        return ResponseEntity.ok(greetingId);
    }
}
