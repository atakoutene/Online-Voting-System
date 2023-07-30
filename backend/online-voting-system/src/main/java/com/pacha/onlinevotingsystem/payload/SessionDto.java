package com.pacha.onlinevotingsystem.payload;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SessionDto {

    private long sess_id;

    private Date sess_date;

    private boolean sess_published;

    private String sess_description;
}
