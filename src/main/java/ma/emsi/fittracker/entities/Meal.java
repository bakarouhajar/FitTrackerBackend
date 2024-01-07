package ma.emsi.fittracker.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mealName;
    // other attributes

    @ManyToMany(mappedBy = "meals")
    private List<Diet> dietRecords;

    // getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public List<Diet> getDietRecords() {
        return dietRecords;
    }

    public void setDietRecords(List<Diet> dietRecords) {
        this.dietRecords = dietRecords;
    }
}

