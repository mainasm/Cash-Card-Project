package apps.cashcard;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CashCard{
    @Id
    private Long id;
    private Double amount;

    public CashCard() {

    }

    public CashCard(Long id, Double amount) {
        this.id = id;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
