package com.raktkosh.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.raktkosh.core.Antigens;
import com.raktkosh.core.BloodTypes;
import com.raktkosh.dto.requests.BloodBankRepositoryIdDTO;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class BloodRepositoryID implements Serializable {

  private static final long serialVersionUID = 7L;

  @Enumerated(value = EnumType.STRING)
  @Column(length = 2)
  private BloodTypes type;
  
  @Enumerated(value = EnumType.STRING)
  @Column(length = 10)
  private Antigens antigen;
  
  @ManyToOne
  @JoinColumn(name = "bank")
  private BloodBank bank;
  
  public static BloodRepositoryID build (BloodBankRepositoryIdDTO repo) {
    BloodBank bank = new BloodBank();
    bank.setId(repo.getBankId());
    return new BloodRepositoryID(repo.getType(), repo.getAntigen(), bank);
  }
}
