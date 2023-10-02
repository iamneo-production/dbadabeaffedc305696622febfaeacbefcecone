//package com.example.springapp.model;
package com.example.springapp.model;

import lombok.Data;

@Data
public class Medicine {
    private int medicineId;
    private String medicineName;
    private float price;
    private int quantity;
    private String description;

 

    // Getters and setters for the attributes
}
