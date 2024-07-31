package pro.sky.Spring_2_11.domen;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> items = new ArrayList<>();

    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
    }

    public String add(List<Integer> id) {
        if (items.addAll(id)) {
            return "Id товаров " + id + " успешно внесены в корзину";
        }
        return null;
    }
}
