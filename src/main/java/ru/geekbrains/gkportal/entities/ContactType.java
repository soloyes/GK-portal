package ru.geekbrains.gkportal.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Data
@Entity(name = "contact_type")
@EqualsAndHashCode(callSuper = true)
public class ContactType extends AbstractEntity {

    @Column(name = "description")
    @NotNull(message = "Couldn't be empty!")
    private String description;

    public ContactType() {
    }

}
