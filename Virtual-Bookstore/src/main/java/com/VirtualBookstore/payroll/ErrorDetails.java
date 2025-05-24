package com.VirtualBookstore.payroll;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
public class ErrorDetails {

    private String message;
    private Date date;
    private String description;
}
