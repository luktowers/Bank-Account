package account.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account_pf")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client{

    @Id
    @Column(name = "pf_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "holder", nullable = true, length = 100)
    private String holder;

    @Column(name = "balance")
    private Double balance;

}
