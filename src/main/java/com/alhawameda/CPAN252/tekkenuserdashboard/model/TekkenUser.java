package com.alhawameda.CPAN252.tekkenuserdashboard.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TekkenUser {
    private String name;
    private int wins;
    private int losses;
    private int draws;
}
