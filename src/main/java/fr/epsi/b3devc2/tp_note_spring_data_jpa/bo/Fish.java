package fr.epsi.b3devc2.tp_note_spring_data_jpa.bo;

import jakarta.persistence.*;


@Entity

public class Fish extends Animal {

    @Enumerated(EnumType.STRING)
    private FishLivEnv livingEnv;

    public FishLivEnv getLivingEnv() {
        return livingEnv;
    }

    public void setLivingEnv(FishLivEnv livingEnv) {
        this.livingEnv = livingEnv;
    }


}
