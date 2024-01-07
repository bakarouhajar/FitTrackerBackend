package ma.emsi.fittracker.controllers;
import ma.emsi.fittracker.entities.User;
import ma.emsi.fittracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS })
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<String> verifyUser(@RequestBody User loginRequest) {
        // Recherche de l'utilisateur par email et mot de passe dans la base de données
        User user = userRepository.findByEmailAndPassword(loginRequest.getEmail(), loginRequest.getPassword());

        if (user != null) {
            // L'utilisateur existe, renvoyer une réponse OK (200)
            return ResponseEntity.ok("Utilisateur vérifié avec succès");
        } else {
            // L'utilisateur n'existe pas ou les identifiants sont incorrects, renvoyer une réponse 404
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}
