package fr.epsi.b3devc2.tp_note_spring_data_jpa.bo;

import jakarta.persistence.*;


@Entity

public class Cat extends Animal {
    private String chipId;

    public String getChipId() {
        return chipId;
    }

    public void setChipId(String chipId) {
        this.chipId = chipId;
    }




}