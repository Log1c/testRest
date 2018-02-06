package ua.logic.entity;

import javax.persistence.*;

@Entity
@Table(name = "userSkills")
public class UserSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    public UserSkills(User user, Skill skill) {
        this.user = user;
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "UserSkills{" +
                "user=" + user +
                ", skill=" + skill +
                '}';
    }
}
