package ie.atu.week3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationRequest {
    private String action; // i.e. created/deleted/updated
    private long entityId; // in this case it is the product ID
    private String entityName; // Name of the product
    private Double entityPrice; // Price of the product
}
