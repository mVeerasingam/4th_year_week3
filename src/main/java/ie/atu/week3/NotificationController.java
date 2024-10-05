package ie.atu.week3;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @PostMapping("/notifications/notify")
    public String notify(@RequestBody NotificationRequest notificationRequest) {
        System.out.println("Notification received:");
        System.out.println("Action: " + notificationRequest.getAction());
        System.out.println("Entity ID: " + notificationRequest.getEntityId());
        System.out.println("Product Name: " + notificationRequest.getEntityName());
        System.out.println("Product Price: " + notificationRequest.getEntityPrice());

        return "Notification acknowledged!";
    }
}
