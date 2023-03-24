package dev.lisuk.strength.session;

import dev.lisuk.strength.session.domain.Session;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/sessions")
public class SessionController {

    @PostMapping
    public Session createSession() {
        return new Session(UUID.randomUUID(), "New Session", LocalDate.now(), List.of());
    }
    @GetMapping("{id}")
    public Session getSession(@PathVariable UUID id) {
        return null;
    }

    @PutMapping("{id}")
    public Session putSession(@PathVariable UUID id, @RequestBody Session session) {
        return null;
    }
}
