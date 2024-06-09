package tech.group.healthchecker.controllers;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.group.healthchecker.models.HealthResponse;

@Slf4j
@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public ResponseEntity<HealthResponse> checkAppHealth(HttpServletRequest request){
        log.info("request from: " + request.getRemoteAddr());
        return ResponseEntity.ok(new HealthResponse("OK"));
    }

    @GetMapping("/error-generate")
    public ResponseEntity<HealthResponse> errorGenerate() throws Exception {
        throw new Exception("test error");
    }
}
