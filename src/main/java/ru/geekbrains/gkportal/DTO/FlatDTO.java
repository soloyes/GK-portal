package ru.geekbrains.gkportal.DTO;

import lombok.Data;

import java.util.UUID;

@Data
public class FlatDTO {

    private String id;
    private int porch;
    private int floor;
    private int flatNumber;
    private int riser;
    private int flatNumberBuild;

}
