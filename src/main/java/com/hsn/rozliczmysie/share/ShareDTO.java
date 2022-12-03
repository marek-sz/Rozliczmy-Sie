package com.hsn.rozliczmysie.share;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ShareDTO {
    private Long userId;
    private BigDecimal amount;
}
