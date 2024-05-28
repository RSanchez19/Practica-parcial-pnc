package com.ronaldsm.preparcial.Model;



import com.ronaldsm.preparcial.Model.User.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="tbl_token")
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID code;
    private String content;
    private boolean active;
    private Date timestamp;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_code")
    @JsonIgnore
    private User user;

    public Token(String content, User user) {
        super();
        this.content = content;
        this.user = user;
        this.timestamp = Date.from(Instant.now());
        this.active = true;
    }
}
