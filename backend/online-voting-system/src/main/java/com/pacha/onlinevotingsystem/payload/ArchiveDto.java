package com.pacha.onlinevotingsystem.payload;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArchiveDto {

    private long arcId;

    private long sessionId;

    private String winnerName;

    private byte[] winnerPlan;

    private byte[] winnerPicture;

    private Date publishedDate;
}
