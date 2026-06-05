package io.szesto.markettimer.markettimer.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingsService implements Greetings {
    @Override
    public List<Greeting> getGreetings() {
        return List.of(new Greeting("Hello world!"), new Greeting("Hello world!"));
    }

    @Override
    public Optional<Greeting> getGreetingById(String greetingId) {
        return Optional.empty();
    }

    @Override
    public String newGreeting(Greeting greeting) {
        return "";
    }
}
