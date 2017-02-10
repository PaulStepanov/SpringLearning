package vkstuff.logic;

        import org.springframework.stereotype.Component;

@Component
public interface UserIDValidator {
    String validateID(String id);
}
