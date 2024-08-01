package pro.sky.Spring_2_11.service;

import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.sky.Spring_2_11.domen.Basket;

import java.util.List;
@Service

public class BasketServiceImpl implements BasketService {

//    private final Basket basket;
//
//    public BasketServiceImpl(Basket basket) {
//        this.basket = basket;
//    }

//    @Autowired   //Можно и так инжектить
//    public Basket basket;

    private final Basket basketConfig;  //Теперь бин приходит не из контекста, а из Джава-конфига

    public BasketServiceImpl(Basket basketConfig) {
        this.basketConfig = basketConfig;
    }

    @Override
    public String add(List<Integer> id) {
        return basketConfig.add(id);
    }

    @Override
    public List<Integer> get() {
        return basketConfig.getItems();
    }
}
