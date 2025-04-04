package com.raktkosh.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BloodBankRepositoryDTO extends BloodBankRepositoryIdDTO {
  private int availability;
}
