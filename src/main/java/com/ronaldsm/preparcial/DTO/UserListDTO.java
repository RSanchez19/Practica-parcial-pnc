package com.ronaldsm.preparcial.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserListDTO {
    private String name;
    private String email;
    @CreationTimestamp
    private Date recruitDate;
    private String role;
}
