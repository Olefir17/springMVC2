package MVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestDataBean {
    @Autowired
    private ContactService contactService;

    @PostConstruct
    public void fillData() {
        Contact contact;

        for (int i = 0; i < 25; i++) {
            contact = new Contact(null, "Name" + i, "Surname" + i, "1234567" + i, "user" + i + "@test.com");
            contactService.addContact(contact);
        }
    }
}
