package ma.emsi.fittracker.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Recorde {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;
    private double weight;
    private double height;
    // other attributes

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinTable(
            name = "fitness_record_exercise",
            joinColumns = @JoinColumn(name = "fitness_record_id"),
            inverseJoinColumns = @JoinColumn(name = "exercise_id"))
    private List<Exercise> exercises;

    // getters

    public Long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public User getUser() {
        return user;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    // setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }
}
