package com.pjatk.quiz.app.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pjatk.quiz.app.sharedkernel.AbstractEntity;
import dev.hilla.Nonnull;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "application_user")
public class User extends AbstractEntity {

    @Nonnull
    private String username;
    @Nonnull
    private String name;
    @JsonIgnore
    private String hashedPassword;
    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.EAGER)
    @Nonnull
    private Set<Role> roles;
    @Nonnull
    @Lob
    @Column(length = 1000000)
    private byte[] profilePicture;
    @OneToMany(mappedBy = "user")
    private Set<Walkthrough> walkthroughs;

    public Set<Walkthrough> getWalkthroughs() {
        return walkthroughs;
    }

    public void setWalkthroughs(Set<Walkthrough> walkthroughs) {
        this.walkthroughs = walkthroughs;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHashedPassword() {
        return hashedPassword;
    }
    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }
    public Set<Role> getRoles() {
        return roles;
    }
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
    public byte[] getProfilePicture() {
        return profilePicture;
    }
    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }

}
