package io.szesto.markettimer.markettimer.services;

import java.util.List;
import java.util.Optional;

public interface Greetings {
    public List<Greeting> getGreetings();
    public Optional<Greeting> getGreetingById(String greetingId);
    public String newGreeting(Greeting greeting);
}
