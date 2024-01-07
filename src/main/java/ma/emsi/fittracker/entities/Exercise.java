package ma.emsi.fittracker.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String exerciseName;
    private String exerciseType;
    private double caloriesBurnedPerUnitTime;
    // other attributes

    @ManyToMany(mappedBy = "exercises")
    private List<Recorde> fitnessRecordes;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(String exerciseType) {
        this.exerciseType = exerciseType;
    }

    public double getCaloriesBurnedPerUnitTime() {
        return caloriesBurnedPerUnitTime;
    }

    public void setCaloriesBurnedPerUnitTime(double caloriesBurnedPerUnitTime) {
        this.caloriesBurnedPerUnitTime = caloriesBurnedPerUnitTime;
    }

    public List<Recorde> getFitnessRecords() {
        return fitnessRecordes;
    }

    public void setFitnessRecords(List<Recorde> fitnessRecordes) {
        this.fitnessRecordes = fitnessRecordes;
    }
}
